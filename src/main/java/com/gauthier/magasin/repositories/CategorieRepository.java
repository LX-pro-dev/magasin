package com.gauthier.magasin.repositories;

import com.gauthier.magasin.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    public Categorie findCategorieById(Long id);
}
