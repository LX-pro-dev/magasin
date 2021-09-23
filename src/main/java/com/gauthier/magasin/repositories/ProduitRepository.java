package com.gauthier.magasin.repositories;

import com.gauthier.magasin.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    public Produit findProduitById(Long id);
}
