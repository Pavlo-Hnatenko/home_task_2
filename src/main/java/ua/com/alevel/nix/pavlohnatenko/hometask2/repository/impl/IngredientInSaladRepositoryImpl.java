package ua.com.alevel.nix.pavlohnatenko.hometask2.repository.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.IngredientInSalad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.repository.IngredientInSaladRepository;

import java.util.ArrayList;
import java.util.List;


public class IngredientInSaladRepositoryImpl implements IngredientInSaladRepository {

    private final List<IngredientInSalad> ingredientInSaladList = new ArrayList<>();

    @Override
    public List<IngredientInSalad> findBySaladName(String saladName) {
        List<IngredientInSalad> saladList = new ArrayList<>();

        for (IngredientInSalad ingredientInSalad :
                ingredientInSaladList) {
            if (ingredientInSalad.getSalad().getSaladName().equals(saladName)) {
                saladList.add(ingredientInSalad);
            }
        }

        return saladList;
    }

    @Override
    public List<IngredientInSalad> findBySaladId(Long id) {

        List<IngredientInSalad> saladList = new ArrayList<>();

        for (IngredientInSalad ingredientInSalad :
                ingredientInSaladList) {
            if (ingredientInSalad.getSalad().getId().equals(id)) {
                saladList.add(ingredientInSalad);
            }
        }

        return saladList;
    }


    @Override
    public List<IngredientInSalad> findByIngredientName(String ingredientName) {

        List<IngredientInSalad> ingredientList = new ArrayList<>();

        for (IngredientInSalad ingredientInSalad :
                ingredientInSaladList) {
            if (ingredientInSalad.getIngredient().getIngredientName().equals(ingredientName)) {
                ingredientList.add(ingredientInSalad);
            }
        }

        return ingredientList;
    }


    @Override
    public List<IngredientInSalad> findByIngredientId(Long ingredientId) {
        List<IngredientInSalad> ingredientList = new ArrayList<>();

        for (IngredientInSalad ingredientInSalad :
                ingredientInSaladList) {
            if (ingredientInSalad.getIngredient().getId().equals(ingredientId)) {
                ingredientList.add(ingredientInSalad);
            }
        }

        return ingredientList;
    }

    @Override
    public void save(IngredientInSalad ingredientInSalad) {

        ingredientInSaladList.add(ingredientInSalad);

    }

    @Override
    public IngredientInSalad findById(Long id) {
        for (IngredientInSalad ingredientInSalad : ingredientInSaladList) {
            if (ingredientInSalad.getId().equals(id)) {
                return ingredientInSalad;
            }
        }

        return null;
    }

    @Override
    public List<IngredientInSalad> findAll() {
        return ingredientInSaladList;
    }

    @Override
    public void update(IngredientInSalad ingredientInSalad) {

        for (IngredientInSalad value : ingredientInSaladList) {
            if (value.getId().equals(ingredientInSalad.getId())) {
                value.setIngredient(ingredientInSalad.getIngredient());
                value.setSalad(ingredientInSalad.getSalad());
            }
        }

    }

    @Override
    public void remove(Long id) {

        ingredientInSaladList.remove(id);

    }
}
