package org.launchcode.bar_helper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TipsController {

    @GetMapping("addtips")
    public String displayTipsPage() {
        return "addtips";
    }

    @GetMapping("listtips")
    public String displayListTipsPage() {
        return "listtips";
    }
}
