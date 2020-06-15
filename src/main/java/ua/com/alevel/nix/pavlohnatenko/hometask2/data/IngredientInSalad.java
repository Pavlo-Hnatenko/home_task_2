package ua.com.alevel.nix.pavlohnatenko.hometask2.data;

public class IngredientInSalad extends AbstractData<IngredientInSalad> {

    private Salad salad;
    private Ingredient ingredient;

    public IngredientInSalad(){

    }

    public IngredientInSalad(Salad salad, Ingredient ingredient){
        this.salad = salad;
        this.ingredient = ingredient;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Salad getSalad() {
        return salad;
    }

    public void setSalad(Salad salad) {
        this.salad = salad;
    }
}
