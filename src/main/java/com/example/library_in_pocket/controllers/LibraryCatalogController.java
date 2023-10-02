package com.example.library_in_pocket.controllers;

import com.example.library_in_pocket.models.CatalogEntity;
import com.example.library_in_pocket.repositories.CatalogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class LibraryCatalogController {

    private final CatalogRepository catalogRepository;

    public LibraryCatalogController(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @GetMapping("/catalog")
    public String catalogBook(Model model) {
        Collection<CatalogEntity> catalogs = catalogRepository.findAll();
        model.addAttribute("catalogs", catalogs);
        return "catalog";

    }
}
