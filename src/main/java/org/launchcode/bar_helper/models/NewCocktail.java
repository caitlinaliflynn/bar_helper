package org.launchcode.bar_helper.models;

import java.util.Objects;

public class NewCocktail {

    private String newCocktailName;
    private String newCocktailDescription;
    private String newCocktailIngredients;
    private String newCocktailRecipe;

    public NewCocktail(String newCocktailName, String newCocktailDescription, String newCocktailIngredients, String newCocktailRecipe) {
        this.newCocktailName = newCocktailName;
        this.newCocktailDescription = newCocktailDescription;
        this.newCocktailIngredients = newCocktailIngredients;
        this.newCocktailRecipe = newCocktailRecipe;
    }

    public String getNewCocktailName() {
        return newCocktailName;
    }

    public void setNewCocktailName(String newCocktailName) {
        this.newCocktailName = newCocktailName;
    }

    public String getNewCocktailDescription() {
        return newCocktailDescription;
    }

    public void setNewCocktailDescription(String newCocktailDescription) {
        this.newCocktailDescription = newCocktailDescription;
    }

    public String getNewCocktailIngredients() {
        return newCocktailIngredients;
    }

    public void setNewCocktailIngredients(String newCocktailIngredients) {
        this.newCocktailIngredients = newCocktailIngredients;
    }

    public String getNewCocktailRecipe() {
        return newCocktailRecipe;
    }

    public void setNewCocktailRecipe(String newCocktailRecipe) {
        this.newCocktailRecipe = newCocktailRecipe;
    }

    @Override
    public String toString() {
        return "Name: " + newCocktailName + '\n' +
                "Description: " + newCocktailDescription + '\n' +
                "Ingredients: " + newCocktailIngredients + '\n' +
                "Recipe: " + newCocktailRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewCocktail that)) return false;
        return Objects.equals(getNewCocktailName(), that.getNewCocktailName()) && Objects.equals(getNewCocktailDescription(), that.getNewCocktailDescription()) && Objects.equals(getNewCocktailIngredients(), that.getNewCocktailIngredients()) && Objects.equals(getNewCocktailRecipe(), that.getNewCocktailRecipe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNewCocktailName(), getNewCocktailDescription(), getNewCocktailIngredients(), getNewCocktailRecipe());
    }
}
