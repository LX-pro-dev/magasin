package com.gauthier.magasin.controllers;

import com.gauthier.magasin.models.Produit;
import com.gauthier.magasin.services.ProduitService;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
@RequestMapping("produit")
public class ProduitController {
    private ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    public List<Produit> findAll() {
        return produitService.findAll();
    }

    public Produit create(Produit produit) {
        return produitService.create(produit);
    }

    public Produit findProduitById(Long id) {
        return produitService.findProduitById(id);
    }

    public void delete(Long id) {
        produitService.delete(id);
    }

    public Produit update(Produit produit) {
        return produitService.update(produit);
    }
}
