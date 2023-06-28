package org.launchcode.bar_helper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchCocktailsController {

    @GetMapping("searchcocktails")
    public String displaySearchCocktailsPage() {
        return "searchcocktails";
    }
}
