package org.launchcode.bar_helper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddCompletedTasksController {

    @GetMapping("addcompletedtasks")
    public String displayCompletedTasksPage() {
        return "addcompletedtasks";
    }
}
