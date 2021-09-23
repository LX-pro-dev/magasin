package com.gauthier.magasin.controllers;

import com.gauthier.magasin.models.Categorie;
import com.gauthier.magasin.services.CategorieService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CategorieController {
    CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    public Categorie create(@RequestBody Categorie client) {
        return categorieService.create(client);
    }

    public Categorie findCategorieById(@PathVariable Long id) {
        return categorieService.findCategorieById(id);
    }

    public void delete(@PathVariable Long id) {
        categorieService.delete(id);
    }

    public Categorie update(@RequestBody Categorie categorie) {
        return categorieService.update(categorie);
    }
}
