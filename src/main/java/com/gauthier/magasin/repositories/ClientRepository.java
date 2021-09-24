package com.gauthier.magasin.repositories;

import com.gauthier.magasin.models.Client;
import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface ClientRepository extends JpaRepository<Client, Long> {
    public Client findClientById(Long id);
}
