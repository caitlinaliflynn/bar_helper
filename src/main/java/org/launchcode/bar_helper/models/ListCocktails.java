package org.launchcode.bar_helper.models;

public class ListCocktails {

    private String listCocktailName;
    private String listCocktailDescription;
    private String listCocktailIngredients;
    private String listCocktailRecipe;

    public ListCocktails(String listCocktailName, String listCocktailDescription, String listCocktailIngredients, String listCocktailRecipe) {
        this.listCocktailName = listCocktailName;
        this.listCocktailDescription = listCocktailDescription;
        this.listCocktailIngredients = listCocktailIngredients;
        this.listCocktailRecipe = listCocktailRecipe;
    }

    public String getListCocktailName() {
        return listCocktailName;
    }

    public void setListCocktailName(String listCocktailName) {
        this.listCocktailName = listCocktailName;
    }

    public String getListCocktailDescription() {
        return listCocktailDescription;
    }

    public void setListCocktailDescription(String listCocktailDescription) {
        this.listCocktailDescription = listCocktailDescription;
    }

    public String getListCocktailIngredients() {
        return listCocktailIngredients;
    }

    public void setListCocktailIngredients(String listCocktailIngredients) {
        this.listCocktailIngredients = listCocktailIngredients;
    }

    public String getListCocktailRecipe() {
        return listCocktailRecipe;
    }

    public void setListCocktailRecipe(String listCocktailRecipe) {
        this.listCocktailRecipe = listCocktailRecipe;
    }

    @Override
    public String toString() {
        return listCocktailName + "|" + listCocktailDescription + "|" + listCocktailIngredients + "|" + listCocktailRecipe;
    }
}
