package com.gauthier.magasin.services;

import com.gauthier.magasin.models.Client;

import java.util.List;

public interface ClientService {
    public List<Client> findAll();

    public Client create(Client client);

    public Client findClientById(Long id);

    public void delete(Long id);

    public Client update(Client client);
}
