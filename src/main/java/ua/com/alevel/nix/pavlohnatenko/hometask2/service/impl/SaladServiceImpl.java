package ua.com.alevel.nix.pavlohnatenko.hometask2.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;
import ua.com.alevel.nix.pavlohnatenko.hometask2.repository.SaladRepository;
import ua.com.alevel.nix.pavlohnatenko.hometask2.repository.impl.SaladRepositoryImpl;
import ua.com.alevel.nix.pavlohnatenko.hometask2.service.SaladService;

import java.util.List;

public class SaladServiceImpl implements SaladService {

    private final SaladRepository saladRepository = new SaladRepositoryImpl();

    public Salad findBySaladName(String saladName) {
        return saladRepository.findBySaladName(saladName);
    }

    public List<Salad> findByIngredientName(String ingredientName) {
        return saladRepository.findByIngredientName(ingredientName);
    }

    public List<Salad> findByIngredientId(Long ingredientId) {
        return saladRepository.findByIngredientId(ingredientId);
    }

    public void saveOrUpdate(Salad salad) {
        if (salad.getId() == null) {
            long id = findAll().size();
            salad.setId(++id);
            saladRepository.save(salad);
        } else {
            saladRepository.update(salad);
        }
    }

    public Salad findById(Long id) {
        return saladRepository.findById(id);
    }

    public List<Salad> findAll() {
        return saladRepository.findAll();
    }

    public void remove(Long id) {
        saladRepository.remove(id);
    }
}
