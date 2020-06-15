package ua.com.alevel.nix.pavlohnatenko.hometask2.repository;

import ua.com.alevel.nix.pavlohnatenko.hometask2.data.Salad;
import java.util.List;

public interface SaladRepository extends AbstractRepository<Salad> {

    Salad findBySaladName(String saladName);
    List<Salad> findByIngredientName(String ingredientName);
    List<Salad> findByIngredientId(Long ingredientId);
}
