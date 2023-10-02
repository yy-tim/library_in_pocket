package com.example.library_in_pocket.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class CatalogEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;

    private String author;

    private String genre;


    public CatalogEntity(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }
}

