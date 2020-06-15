package ua.com.alevel.nix.pavlohnatenko.hometask2.service;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Ingredient;

import java.util.List;

public interface IngredientService extends AbstractService<Ingredient> {

    Ingredient findByIngredientName(String ingredientName);
    List<Ingredient> findBySaladName(String saladName);
    List<Ingredient> findBySaladId(Long id);
}
