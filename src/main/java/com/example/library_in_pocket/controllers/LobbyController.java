package com.example.library_in_pocket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LobbyController {

    @GetMapping("/")
    public String lobby(Model model) {
        model.addAttribute("title", "Холл библиотеки");
        return "lobby";

    }
}