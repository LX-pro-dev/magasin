package com.gauthier.magasin.repositories;

import com.gauthier.magasin.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    public Commande findCommandeById(Long id);
}
