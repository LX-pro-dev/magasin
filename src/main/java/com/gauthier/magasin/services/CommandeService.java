package com.gauthier.magasin.services;

import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.models.Produit;

import java.util.List;
import java.util.Set;

public interface CommandeService {
    public List<Commande> findAll();

    public Commande create(Commande commande);

    public Commande findCommandeById(Long id);

    public void delete(Long id);

    public Commande update(Commande commande);

    public Set<Produit> findProduitsByCommandeId(Long id);
}
