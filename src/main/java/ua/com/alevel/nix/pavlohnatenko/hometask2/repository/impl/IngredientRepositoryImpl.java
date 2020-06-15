package ua.com.alevel.nix.pavlohnatenko.hometask2.repository.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Ingredient;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.IngredientInSalad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.repository.IngredientRepository;

import java.util.ArrayList;
import java.util.List;

public class IngredientRepositoryImpl implements IngredientRepository {

    private final List<Ingredient> ingredientList = new ArrayList<>();


    @Override
    public Ingredient findByIngredientName(String ingredientName) {
        for (Ingredient ingredient :
                ingredientList) {
            if (ingredient.getIngredientName().equals(ingredientName)) {
                return ingredient;
            }
        }

        return null;
    }

    @Override
    public List<Ingredient> findBySaladName(String saladName) {

        List<Ingredient> ingredients = new ArrayList<>();
        for (Ingredient ingredient :
                ingredientList) {
            for (IngredientInSalad ingredientInSalad :
                    ingredient.getIngredientInSaladList()) {
                if (ingredientInSalad.getSalad().getSaladName().equals(saladName)) {
                    ingredients.add(ingredient);
                }

            }

        }

        return ingredients;

    }

    @Override
    public List<Ingredient> findBySaladId(Long id) {
        List<Ingredient> ingredients = new ArrayList<>();
        for (Ingredient ingredient :
                ingredientList) {
            for (IngredientInSalad ingredientInSalad :
                    ingredient.getIngredientInSaladList()) {
                if (ingredientInSalad.getSalad().getId().equals(id)) {
                    ingredients.add(ingredient);
                }

            }

        }

        return ingredients;
    }

    @Override
    public void save(Ingredient ingredient) {

        ingredientList.add(ingredient);

    }

    @Override
    public Ingredient findById(Long id) {

        for (Ingredient ingredient : ingredientList) {
            if (ingredient.getId().equals(id)) {
                return ingredient;
            }
        }

        return null;
    }

    @Override
    public List<Ingredient> findAll() {
        return ingredientList;
    }

    @Override
    public void update(Ingredient ingredient) {

        for (Ingredient value : ingredientList) {
            if (value.getId().equals(ingredient.getId())) {
                value.setIngredientInSaladList(ingredient.getIngredientInSaladList());
                value.setIngredientName(ingredient.getIngredientName());
            }
        }

    }

    @Override
    public void remove(Long id) {

        ingredientList.remove(id);

    }
}
