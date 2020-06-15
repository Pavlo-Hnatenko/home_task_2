package ua.com.alevel.nix.pavlohnatenko.hometask2.data;

import java.util.List;
import java.util.Objects;

public class Ingredient extends AbstractData<Ingredient> {

    private String ingredientName;
    private List<IngredientInSalad> ingredientInSaladList;

    public Ingredient(){

    }

    public Ingredient(String ingredientName){
        this.ingredientName = ingredientName;
    }

    public List<IngredientInSalad> getIngredientInSaladList() {
        return ingredientInSaladList;
    }

    public void setIngredientInSaladList(List<IngredientInSalad> ingredientInSaladList) {
        this.ingredientInSaladList = ingredientInSaladList;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return getIngredientName().equals(that.getIngredientName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIngredientName());
    }
}
