package org.launchcode.bar_helper.models;

public class SearchCocktails {

    private String searchCocktailName;
    private String searchCocktailDescription;
    private String searchCocktailIngredients;
    private String searchCocktailRecipe;

    public SearchCocktails(String searchCocktailName, String searchCocktailDescription, String searchCocktailIngredients, String searchCocktailRecipe) {
        this.searchCocktailName = searchCocktailName;
        this.searchCocktailDescription = searchCocktailDescription;
        this.searchCocktailIngredients = searchCocktailIngredients;
        this.searchCocktailRecipe = searchCocktailRecipe;
    }

    public String getSearchCocktailName() {
        return searchCocktailName;
    }

    public void setSearchCocktailName(String searchCocktailName) {
        this.searchCocktailName = searchCocktailName;
    }

    public String getSearchCocktailDescription() {
        return searchCocktailDescription;
    }

    public void setSearchCocktailDescription(String searchCocktailDescription) {
        this.searchCocktailDescription = searchCocktailDescription;
    }

    public String getSearchCocktailIngredients() {
        return searchCocktailIngredients;
    }

    public void setSearchCocktailIngredients(String searchCocktailIngredients) {
        this.searchCocktailIngredients = searchCocktailIngredients;
    }

    public String getSearchCocktailRecipe() {
        return searchCocktailRecipe;
    }

    public void setSearchCocktailRecipe(String searchCocktailRecipe) {
        this.searchCocktailRecipe = searchCocktailRecipe;
    }

    @Override
    public String toString() {
        return "Search Cocktails" + '\n' +
                "Name: " + searchCocktailName + '\n' +
                "Description: " + searchCocktailDescription + '\n' +
                "Ingredient: " + searchCocktailIngredients + '\n' +
                "Word/term from Recipe: " + searchCocktailRecipe;
    }
}
