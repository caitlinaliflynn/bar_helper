package org.launchcode.bar_helper.controllers;

import org.launchcode.bar_helper.models.AddTODOTasks;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TODOTasksController {

    public static List<AddTODOTasks> todoTasksList = new ArrayList<>();

    @GetMapping("addtodotasks")
    public String displayAddTODOTasksPage() {

        return "addtodotasks";
    }

    @PostMapping("addtodotasks")
    public String processAddTODOTasksPage(@RequestParam String todoTaskName, String todoTaskNotes, Date desiredCompletionDate) {
        todoTasksList.add(new AddTODOTasks(todoTaskName, todoTaskNotes, desiredCompletionDate));
        return "addtodotasks";
    }

    @GetMapping("listtodotasks")
    public String displayTODOTasksPage(Model model) {
        model.addAttribute("todotasks", todoTasksList);
        return "listtodotasks";
    }
}
