package com.gauthier.magasin.controllers;

import com.gauthier.magasin.models.Categorie;
import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.services.CategorieService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
@Data
@RestController
@CrossOrigin
@RequestMapping("categorie")
public class CategorieController {
    CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
    @GetMapping
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @PostMapping
    public Categorie create(@RequestBody Categorie client) {
        return categorieService.create(client);
    }

    @GetMapping("{id}")
    public Categorie findCategorieById(@PathVariable Long id) {
        return categorieService.findCategorieById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        categorieService.delete(id);
    }

    @PutMapping
    public Categorie update(@RequestBody Categorie categorie) {
        return categorieService.update(categorie);
    }


}
