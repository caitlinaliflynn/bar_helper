package org.launchcode.bar_helper.controllers;

import org.launchcode.bar_helper.models.AddCompletedTasks;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class CompletedTasksController {

    public static List<AddCompletedTasks> completedTasksList = new ArrayList<>();

    @GetMapping("addcompletedtasks")
    public String displayCompletedTasksPage() {
        return "addcompletedtasks";
    }

    @PostMapping("addcompletedtasks")
    public String processAddCompletedTasksPage(@RequestParam String completedTaskName, String completedTaskNotes, Date dateCompleted){
        completedTasksList.add(new AddCompletedTasks(completedTaskName, completedTaskNotes, dateCompleted));
        return "addcompletedtasks";
    }

    @GetMapping("listcompletedtasks")
    public String displayListCompletedTasksPage(Model model) {
        model.addAttribute("completedtasks", completedTasksList);
        return "listcompletedtasks";
    }
}
