package ua.com.alevel.nix.pavlohnatenko.hometask2.service;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;

import java.util.List;

public interface SaladService extends AbstractService<Salad> {

    Salad findBySaladName(String saladName);
    List<Salad> findByIngredientName(String ingredientName);
    List<Salad> findByIngredientId(Long ingredientId);
}
