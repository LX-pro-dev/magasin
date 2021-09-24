package com.gauthier.magasin.services.impl;

import com.gauthier.magasin.models.Client;
import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.models.Produit;
import com.gauthier.magasin.repositories.ClientRepository;
import com.gauthier.magasin.services.ClientService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public List<Client> findAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Client create(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Client findClientById(Long id) {
        return this.clientRepository.findClientById(id);
    }

    @Override
    public void delete(Long id) {
        this.clientRepository.deleteById(id);
    }

    @Override
    public Client update(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Set<Commande> findCommandesByClientId(Long id) {
        return this.clientRepository.findClientById(id).getCommandes();
    }

    @Override
    public List<Produit> findProduitsByCommandeIdByClientId(Long id) {
        List<Produit> tousLesProduits = new ArrayList<>();
        Set<Set<Produit>> toutesLesCommandes = new HashSet<>();
        findClientById(id).getCommandes().forEach(commande -> toutesLesCommandes.add(commande.getProduits()));
//        toutesLesCommandes.forEach(produit -> tousLesProduits.add(produit);)
        System.out.println(toutesLesCommandes);
        return null;
    }
}
