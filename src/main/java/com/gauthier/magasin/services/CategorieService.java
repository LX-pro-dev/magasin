package com.gauthier.magasin.services;

import com.gauthier.magasin.models.Categorie;

import java.util.List;

public interface CategorieService {
    public List<Categorie> findAll();

    public Categorie create(Categorie client);

    public Categorie findCategorieById(Long id);

    public void delete(Long id);

    public Categorie update(Categorie client);
}
