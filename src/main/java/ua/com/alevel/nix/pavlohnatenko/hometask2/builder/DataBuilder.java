package ua.com.alevel.nix.pavlohnatenko.hometask2.builder;

import ua.com.alevel.nix.pavlohnatenko.hometask2.config.ApplicationEnvironment;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.IngredientInSalad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Ingredient;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.IngredienInSaladService;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.SaladService;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.IngredientService;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.impl.IngredientInSaladServiceImpl;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.impl.SaladServiceImpl;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.impl.IngredientServiceImpl;

import java.util.List;
import java.util.Map;

public class DataBuilder implements AbstractBuilder {

    private final SaladService saladService = new SaladServiceImpl();
    private final IngredientService ingredientService = new IngredientServiceImpl();
    private final IngredienInSaladService ingredienInSaladService = new IngredientInSaladServiceImpl();

    @Override
    public void buildDataList() {


        for (Map.Entry<String, String> entry : getKeyValueMapByBundleProperties(ApplicationEnvironment.getPropertyLang()).entrySet()) {
            Salad salad = new Salad(entry.getKey());
            saladService.saveOrUpdate(salad);
            for (String ingredientName : entry.getValue().split(";")) {
                Ingredient ingredient = new Ingredient(ingredientName);
                ingredientService.saveOrUpdate(ingredient);
                ingredienInSaladService.saveOrUpdate(new IngredientInSalad(salad, ingredient));
            }
        }

        ingredientService.findAll().forEach(ingredient -> {
            List<Salad> salads = saladService.findByIngredientName(ingredient.getIngredientName());
            salads.forEach(salad -> {
                ingredient.setIngredientInSaladList(ingredienInSaladService.findBySaladName(salad.getSaladName()));
                ingredientService.saveOrUpdate(ingredient);
            });
        });

        ingredientService.findAll().forEach(ingredient -> System.out.println("ingredient = " + ingredient.getIngredientName()));
    }

    public SaladService getSaladService() {
        return saladService;
    }

    public IngredientService getIngredientService() {
        return ingredientService;
    }

    public IngredienInSaladService getIngredienInSaladService() {
        return ingredienInSaladService;
    }
}
