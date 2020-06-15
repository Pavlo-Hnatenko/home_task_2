package ua.com.alevel.nix.pavlohnatenko.hometask2.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.com.alevel.nix.pavlohnatenko.hometask2.builder.DataBuilder;
import ua.com.alevel.nix.pavlohnatenko.hometask2.config.ApplicationEnvironment;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.impl.IngredientInSaladServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class IngredienInSaladServiceTest {

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
    void findBySaladId() {
    }

    @Test
    void findByIngredientName() {
    }

    @Test
    void findByIngredientId() {
    }
}