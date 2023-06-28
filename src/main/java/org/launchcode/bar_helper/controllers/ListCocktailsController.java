package org.launchcode.bar_helper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static org.launchcode.bar_helper.controllers.AddNewCocktailController.cocktailsList;

@Controller
public class ListCocktailsController {

    @GetMapping("listcocktails")
    public String displayListCocktailsPage(Model model) {
        model.addAttribute("cocktails", cocktailsList);
        return "listcocktails";
    }
}
