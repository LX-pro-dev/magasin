package com.gauthier.magasin.services;

import com.gauthier.magasin.models.Client;
import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.models.Produit;

import java.util.List;
import java.util.Set;

public interface ClientService {
    public List<Client> findAll();

    public Client create(Client client);

    public Client findClientById(Long id);

    public void delete(Long id);

    public Client update(Client client);

    public Set<Commande> findCommandesByClientId(Long id);

    public List<Produit> findProduitsByCommandeIdByClientId(Long id);
}
