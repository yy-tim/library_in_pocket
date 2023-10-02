package com.example.library_in_pocket.controllers;

import com.example.library_in_pocket.models.CatalogEntity;
import com.example.library_in_pocket.repositories.CatalogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BookController {
    public BookController(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    private final CatalogRepository catalogRepository;

    @GetMapping("/add/book")
    public String addBook(Model model) {
        model.addAttribute("title", "Добавить книгу");
        return "add-book";

    }

    @PostMapping("/book/add")
    public String bookPostAdd(@RequestParam String name, @RequestParam String author, @RequestParam String genre, Model model) {
        CatalogEntity catalog = new CatalogEntity(name, author, genre);
        catalogRepository.save(catalog);
        return "redirect:catalog";
    }

}