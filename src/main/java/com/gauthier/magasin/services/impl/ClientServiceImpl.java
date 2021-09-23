package com.gauthier.magasin.services.impl;

import com.gauthier.magasin.models.Client;
import com.gauthier.magasin.repositories.ClientRepository;
import com.gauthier.magasin.services.ClientService;

import java.util.List;

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
        return this.clientRepository.FindClientById();
    }

    @Override
    public void delete(Long id) {
        this.clientRepository.deleteById(id);
    }

    @Override
    public Client update(Client client) {
        return this.clientRepository.save(client);
    }
}
