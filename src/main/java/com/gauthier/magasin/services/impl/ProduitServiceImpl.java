package com.gauthier.magasin.services.impl;

import com.gauthier.magasin.models.Produit;
import com.gauthier.magasin.repositories.ProduitRepository;
import com.gauthier.magasin.services.ProduitService;

import java.util.List;

public class ProduitServiceImpl implements ProduitService {

    private ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> findAll() {
        return this.produitRepository.findAll();
    }

    @Override
    public Produit create(Produit produit) {
        return this.produitRepository.save(produit);
    }

    @Override
    public Produit findProduitById(Long id) {
        return this.produitRepository.findProduitById(id);
    }

    @Override
    public void delete(Long id) {
        this.produitRepository.deleteById(id);
    }

    @Override
    public Produit update(Produit produit) {
        return this.produitRepository.save(produit);
    }
}
