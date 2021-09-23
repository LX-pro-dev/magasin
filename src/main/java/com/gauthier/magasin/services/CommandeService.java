package com.gauthier.magasin.services;

import com.gauthier.magasin.models.Commande;

import java.util.List;

public interface CommandeService {
    public List<Commande> findAll();

    public Commande create(Commande commande);

    public Commande findCommandeById(Long id);

    public void delete(Long id);

    public Commande update(Commande commande);
}
