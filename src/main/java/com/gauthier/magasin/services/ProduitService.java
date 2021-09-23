package com.gauthier.magasin.services;

import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.models.Produit;

import java.util.List;

public interface ProduitService {
    public List<Produit> findAll();

    public Produit create(Produit produit);

    public Produit findProduitById(Long id);

    public void delete(Long id);

    public Produit update(Produit produit);
}
