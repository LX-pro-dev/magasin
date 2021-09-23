package com.gauthier.magasin.services.impl;

import com.gauthier.magasin.models.Commande;
import com.gauthier.magasin.repositories.CommandeRepository;
import com.gauthier.magasin.services.CommandeService;

import java.util.List;

public class CommandeServiceImpl implements CommandeService {
    private CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public List<Commande> findAll() {
        return this.commandeRepository.findAll();
    }

    @Override
    public Commande create(Commande commande) {
        return this.commandeRepository.save(commande);
    }

    @Override
    public Commande findCommandeById(Long id) {
        return this.commandeRepository.findCommandeById(id);
    }

    @Override
    public void delete(Long id) {
        this.commandeRepository.deleteById(id);
    }

    @Override
    public Commande update(Commande commande) {
        return this.commandeRepository.save(commande);
    }
}
