package org.launchcode.bar_helper.controllers;

import org.launchcode.bar_helper.models.NewCocktail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewCocktailController {

    public static List<NewCocktail> cocktailsList = new ArrayList<>();

    @GetMapping("addnewcocktail")
    public String displayAddNewCocktailPage() {
        return "addnewcocktail";
    }

    @PostMapping("addnewcocktail")
    public String processAddCocktailPage(@RequestParam String newCocktailName, String newCocktailDescription, String newCocktailIngredients, String newCocktailRecipe) {
        cocktailsList.add(new NewCocktail(newCocktailName, newCocktailDescription, newCocktailIngredients, newCocktailRecipe));
        return "addnewcocktail";
    }

    @GetMapping("listcocktails")
    public String displayListCocktailsPage(Model model) {
        model.addAttribute("cocktails", cocktailsList);
        return "listcocktails";
    }
}
