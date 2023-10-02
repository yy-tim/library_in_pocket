package com.example.library_in_pocket.controllers;
import com.example.library_in_pocket.models.CatalogEntity;
import com.example.library_in_pocket.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryCatalogController {

    @Autowired
    private CatalogRepository catalogRepository;

    @GetMapping("/catalog")
    public String catalogBook(Model model){
        Iterable<CatalogEntity> catalogs = catalogRepository.findAll();
        model.addAttribute("catalogs", catalogs);
        return "catalog";

    }
}
