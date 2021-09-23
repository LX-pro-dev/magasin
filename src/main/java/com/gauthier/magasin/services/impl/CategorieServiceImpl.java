package com.gauthier.magasin.services.impl;

import com.gauthier.magasin.models.Categorie;
import com.gauthier.magasin.repositories.CategorieRepository;
import com.gauthier.magasin.services.CategorieService;

import java.util.List;

public class CategorieServiceImpl implements CategorieService {

    private CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<Categorie> findAll() {
        return this.categorieRepository.findAll();
    }

    @Override
    public Categorie create(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    @Override
    public Categorie findCategorieById(Long id) {
        return this.categorieRepository.findCategorieById(id);
    }

    @Override
    public void delete(Long id) {
        this.categorieRepository.deleteById(id);

    }

    @Override
    public Categorie update(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }
}
