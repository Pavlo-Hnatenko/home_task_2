package ua.com.alevel.nix.pavlohnatenko.hometask2.service;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Ingredient;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.IngredientInSalad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;

import java.util.List;

public interface IngredienInSaladService extends AbstractService<IngredientInSalad> {

    List<IngredientInSalad> findBySaladName(String saladName);
    List<IngredientInSalad> findBySaladId(Long id);
    List<IngredientInSalad> findByIngredientName(String ingredientName);
    List<IngredientInSalad> findByIngredientId(Long ingredientId);
}
