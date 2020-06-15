package ua.com.alevel.nix.pavlohnatenko.hometask2.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Ingredient;
import ua.com.alevel.nix.pavlohnatenko.hometask2.repository.IngredientRepository;
import ua.com.alevel.nix.pavlohnatenko.hometask2.repository.impl.IngredientRepositoryImpl;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.IngredientService;

import java.util.List;

public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository = new IngredientRepositoryImpl();

    @Override
    public Ingredient findByIngredientName(String ingredientName) {
        return ingredientRepository.findByIngredientName(ingredientName);
    }

    public List<Ingredient> findBySaladName(String saladName)
    {
        return ingredientRepository.findBySaladName(saladName);
    }

    public List<Ingredient> findBySaladId(Long saladId) {

        return ingredientRepository.findBySaladId(saladId);
    }

    public void saveOrUpdate(Ingredient ingredient) {
        if (ingredient.getId() == null) {
            long id = findAll().size();
            ingredient.setId(++id);
            ingredientRepository.save(ingredient);
        } else {
            ingredientRepository.update(ingredient);
        }
    }

    public Ingredient findById(Long id) {
        return ingredientRepository.findById(id);
    }

    public List<Ingredient> findAll() {
        return ingredientRepository.findAll();
    }

    public void remove(Long id) {
        ingredientRepository.remove(id);
    }

}
