package com.gauthier.magasin.repositories;

import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    public Commande findCommandeById(Long id);

}
