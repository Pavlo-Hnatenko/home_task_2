package ua.com.alevel.nix.pavlohnatenko.hometask2.repository.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.IngredientInSalad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.repository.SaladRepository;

import java.util.ArrayList;
import java.util.List;


public class SaladRepositoryImpl implements SaladRepository {

    private final List<Salad> saladList = new ArrayList<>();


    @Override
    public Salad findBySaladName(String saladName) {
        for (Salad salad :
                saladList) {
            if (salad.getSaladName().equals(saladName)) {
                return salad;
            }
        }

        return null;

    }

    public List<Salad> findByIngredientName(String ingredientName) {

        List<Salad> saladWithIngredientList = new ArrayList<>();
        for (Salad salad :
                saladList) {
            for (IngredientInSalad ingredientInSalad :
                    salad.getIngredientInSaladList()) {
                if (ingredientInSalad.getIngredient().getIngredientName().equals(ingredientName)) {
                    saladWithIngredientList.add(salad);
                }

            }

        }

        return saladWithIngredientList;

    }


    public List<Salad> findByIngredientId(Long ingredientId) {

        List<Salad> saladWithIngredientList = new ArrayList<>();
        for (Salad salad :
                saladList) {
            for (IngredientInSalad ingredientInSalad :
                    salad.getIngredientInSaladList()) {
                if (ingredientInSalad.getIngredient().getId().equals(ingredientId)) {
                    saladWithIngredientList.add(salad);
                }

            }

        }

        return saladWithIngredientList;
    }

    public void save(Salad salad) {
        saladList.add(salad);
    }

    public Salad findById(Long id) {

        for (Salad salad : saladList) {
            if (salad.getId().equals(id)) {
                return salad;
            }
        }

        return null;

    }

    public List<Salad> findAll() {
        return saladList;
    }

    public void update(Salad salad) {

        for (Salad value : saladList) {
            if (value.getId().equals(salad.getId())) {
                value.setIngredientInSaladList(salad.getIngredientInSaladList());
                value.setName(salad.getSaladName());
            }
        }

    }

    public void remove(Long id) {

        saladList.remove(id);

    }
}
