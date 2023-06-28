package org.launchcode.bar_helper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListTODOTasksController {

    @GetMapping("listtodotasks")
    public String displayTODOTasksPage() {
        return "listtodotasks";
    }
}
