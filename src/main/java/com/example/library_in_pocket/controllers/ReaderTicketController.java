package com.example.library_in_pocket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ReaderTicketController {


    @GetMapping("/reader-ticket")
    public String readerTicket(Model model){
        model.addAttribute("title", "Предъявить читательский билет");
        return "reader-ticket";

    }
}


