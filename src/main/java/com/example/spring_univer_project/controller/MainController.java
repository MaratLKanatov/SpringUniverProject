package com.example.spring_univer_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getHomePage() {
        return "pageHome";
    }

    @GetMapping("/auth/login")
    public String getAuthPage(Model model) {
        model.addAttribute("intent", "login");
        model.addAttribute("registerStatus", "NOK");
        return "pageLogin";
    }

    @PostMapping("/auth/login")
    public String postAuthPage() {
        return "redirect:/";
    }

    @GetMapping("/auth/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("intent", "reg");
        model.addAttribute("registerStatus", "OK");
        return "pageLogin";
    }

    @GetMapping("/about-us")
    public String getAboutUs() {
        return "aboutUs";
    }
}
