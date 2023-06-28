package org.launchcode.bar_helper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class AddNewCocktailController {

    public static ArrayList cocktailsList = new ArrayList<>();

    @GetMapping("addnewcocktail")
    public String displayAddNewCocktailPage() {
        return "addnewcocktail";
    }

    @PostMapping("addnewcocktail")
    public String processAddCocktailPage(@RequestParam String newCocktail) {
        cocktailsList.add(newCocktail);
        return "addnewcocktail";
    }
}
