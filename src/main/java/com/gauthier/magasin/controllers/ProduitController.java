package com.gauthier.magasin.controllers;

import com.gauthier.magasin.models.Produit;
import com.gauthier.magasin.services.ProduitService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Data
@RequestMapping("produit")
public class ProduitController {
    private ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public List<Produit> findAll() { return produitService.findAll();  }

    @PostMapping
    public Produit create(@RequestBody Produit produit) {
        return produitService.create(produit);
    }

    @GetMapping("{id}")
    public Produit findProduitById(@PathVariable Long id) {
        return produitService.findProduitById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        produitService.delete(id);
    }

    @PutMapping
    public Produit update(@RequestBody Produit produit) {
        return produitService.update(produit);
    }
}
