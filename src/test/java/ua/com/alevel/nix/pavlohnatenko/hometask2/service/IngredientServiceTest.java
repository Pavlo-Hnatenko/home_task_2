package ua.com.alevel.nix.pavlohnatenko.hometask2.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.com.alevel.nix.pavlohnatenko.hometask2.builder.DataBuilder;
import ua.com.alevel.nix.pavlohnatenko.hometask2.config.ApplicationEnvironment;

import static org.junit.jupiter.api.Assertions.*;

class IngredientServiceTest {

    DataBuilder databuilder;

    @BeforeAll
    public static void setEnv() {
        ApplicationEnvironment.setPropertyLang("en");
    }

    @BeforeEach
    void setUp() {
        databuilder = new DataBuilder();
        databuilder.buildDataList();
    }



    @Test
    void findByIngredientNameName() {
        DataBuilder dataBuilder = new DataBuilder();
        IngredientService ingredientService = dataBuilder.getIngredientService();
        SaladService saladService = dataBuilder.getSaladService();
        dataBuilder.buildDataList();

        assertTrue(ingredientService.findAll().size() == 7);
        assertEquals(saladService.findAll().size(), 5);


    }

    @Test
    void findBySaladName() {
    }

    @Test
    void findBySaladId() {
    }
}