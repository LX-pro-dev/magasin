package com.gauthier.magasin.controllers;

import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.services.CommandeService;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
@CrossOrigin
@RequestMapping("commande")
public class CommandeController {
    private CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    public List<Commande> findAll() {
        return commandeService.findAll();
    }

    public Commande create(Commande commande) {
        return commandeService.create(commande);
    }

    public Commande findCommandeById(Long id) {
        return commandeService.findCommandeById(id);
    }

    public void delete(Long id) {
        commandeService.delete(id);
    }

    public Commande update(Commande commande) {
        return commandeService.update(commande);
    }
}
