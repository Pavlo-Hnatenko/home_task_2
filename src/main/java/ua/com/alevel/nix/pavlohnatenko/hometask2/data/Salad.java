package ua.com.alevel.nix.pavlohnatenko.hometask2.data;

import java.util.List;
import java.util.Objects;

public class Salad extends AbstractData<Salad> {

    private String saladName;
    private List<IngredientInSalad> ingredientInSaladList;

    public Salad(){

    }

    public Salad(String saladName){
        this.saladName = saladName;
    }

    public String getSaladName() {
        return saladName;
    }

    public void setName(String saladName) {
        this.saladName = saladName;
    }

    public List<IngredientInSalad> getIngredientInSaladList() {
        return ingredientInSaladList;
    }

    public void setIngredientInSaladList(List<IngredientInSalad> ingredientInSaladList) {
        this.ingredientInSaladList = ingredientInSaladList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salad salad = (Salad) o;
        return saladName.equals(salad.saladName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saladName);
    }
}

