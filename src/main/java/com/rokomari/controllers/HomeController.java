package com.rokomari.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name, Model model){
        model.addAttribute("name", name);
        return "welcome";
    }
}
