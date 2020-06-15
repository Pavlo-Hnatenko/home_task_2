package ua.com.alevel.nix.pavlohnatenko.hometask2.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.IngredientInSalad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.repository.IngredientInSaladRepository;
import ua.com.alevel.nix.pavlohnatenko.hometask2.repository.impl.IngredientInSaladRepositoryImpl;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.IngredienInSaladService;

import java.util.List;


public class IngredientInSaladServiceImpl implements IngredienInSaladService {

    private final IngredientInSaladRepository ingredientInSaladRepository = new IngredientInSaladRepositoryImpl();

    @Override
    public List<IngredientInSalad> findBySaladName(String saladName) {

        return ingredientInSaladRepository.findBySaladName(saladName);
    }

    @Override
    public List<IngredientInSalad> findBySaladId(Long id) {
        return ingredientInSaladRepository.findBySaladId(id);
    }

    @Override
    public List<IngredientInSalad> findByIngredientName(String ingredientName) {
        return ingredientInSaladRepository.findByIngredientName(ingredientName);
    }

    @Override
    public List<IngredientInSalad> findByIngredientId(Long ingredientId) {
        return ingredientInSaladRepository.findByIngredientId(ingredientId);
    }

    @Override
    public void saveOrUpdate(IngredientInSalad ingredientInSalad) {


        if (ingredientInSalad.getId() == null) {
            long id = findAll().size();
            ingredientInSalad.setId(++id);
            ingredientInSaladRepository.save(ingredientInSalad);
        } else {
            ingredientInSaladRepository.update(ingredientInSalad);
        }

    }

    @Override
    public IngredientInSalad findById(Long id) {

        return ingredientInSaladRepository.findById(id);
    }

    @Override
    public List<IngredientInSalad> findAll() {

        return ingredientInSaladRepository.findAll();
    }

    @Override
    public void remove(Long id) {

        ingredientInSaladRepository.remove(id);

    }
}
