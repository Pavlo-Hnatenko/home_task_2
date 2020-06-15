import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ua.com.alevel.nix.pavlohnatenko.hometask2.builder.DataBuilder;
import ua.com.alevel.nix.pavlohnatenko.hometask2.config.ApplicationEnvironment;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Ingredient;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.SaladService;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.IngredientService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DataBuilderTest {

    @BeforeAll
    public static void setEnv() {
        ApplicationEnvironment.setPropertyLang("en");
    }

    @Test
    public void build() {

        DataBuilder dataBuilder = new DataBuilder();
        IngredientService ingredientService = dataBuilder.getIngredientService();
        SaladService saladService = dataBuilder.getSaladService();
        dataBuilder.buildDataList();

        assertTrue(ingredientService.findAll().size() == 9);
        assertEquals(saladService.findAll().size(), 5);

        Salad salad = new Salad();
        String saladName = "Sea";
        salad.setName(saladName);

        List<Ingredient> ingredientList = new ArrayList<>();
        String ingredientName = "Seafood";

        Ingredient ingredient = new Ingredient();
        ingredient.setIngredientName(ingredientName);
        ingredientService.saveOrUpdate(ingredient);
        ingredientList.add(ingredientService.findByIngredientName(ingredientName));

//        salad.setIngredientList(ingredientList); ЭТА СТРОКА НЕРАБОЧАЯ, МЕТОД setIngredientList ОТСУТСТВУЕТ И ДОЛЖЕН БЫТЬ ЗАМЕНЕН
        saladService.saveOrUpdate(salad);

        ingredientService.findAll().forEach(currentIngredient -> {
            List<Salad> salads = saladService.findByIngredientName(currentIngredient.getIngredientName());
            salads.forEach(currentSalad -> {
                ingredient.setIngredientInSaladList(currentSalad.getIngredientInSaladList());
                ingredientService.saveOrUpdate(currentIngredient);
            });
        });

        assertTrue(ingredientService.findAll().size() == 10);
        assertEquals(saladService.findAll().size(), 6);
    }
}
