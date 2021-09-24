package com.gauthier.magasin.controllers;

import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.models.Produit;
import com.gauthier.magasin.services.CommandeService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@Data
@CrossOrigin
@RequestMapping("commande")
public class CommandeController {
    private CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping
    public List<Commande> findAll() {  return commandeService.findAll();  }

    @PostMapping
    public Commande create(@RequestBody Commande commande) {
        return commandeService.create(commande);
    }

    @GetMapping("{id}")
    public Commande findCommandeById(@PathVariable Long id) {
        return commandeService.findCommandeById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        commandeService.delete(id);
    }

    @PutMapping
    public Commande update(@RequestBody Commande commande) {
        return commandeService.update(commande);
    }

    @GetMapping("{id}/commandes")
    public Set<Produit> findProduitsByCommandeId(@PathVariable Long id) {
        return this.commandeService.findProduitsByCommandeId(id);
    }
}
