package com.gauthier.magasin.controllers;

import com.gauthier.magasin.models.Client;
import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.models.Produit;
import com.gauthier.magasin.services.ClientService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Data
@RestController
@CrossOrigin
@RequestMapping("client")
public class ClientController {

    private ClientService clientService;

    public ClientController(){};

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> findAll() {
        return this.clientService.findAll();
    }

    @GetMapping("{id}")
    public Client findClientById(@PathVariable Long id) {
        return this.clientService.findClientById(id);
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return this.clientService.create(client);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.clientService.delete(id);
    }

    @PutMapping
    public Client update(@RequestBody Client client) {
        return this.clientService.update(client);
    }

    @GetMapping("{id}/commandes")
    public Set<Commande> findCommandesByClientById(@PathVariable Long id) {
        return this.clientService.findCommandesByClientId(id);
    }

    @GetMapping("{id}/commandes/produits")
    public List<Produit> findProduitsByCommandeIdByClientById(@PathVariable Long id) {
        return this.clientService.findProduitsByCommandeIdByClientId(id);
    }

}
