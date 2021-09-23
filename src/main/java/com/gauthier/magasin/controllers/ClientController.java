package com.gauthier.magasin.controllers;

import com.gauthier.magasin.models.Client;
import com.gauthier.magasin.services.ClientService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@CrossOrigin
@RequestMapping("client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public List<Client> findAll() {
        return this.clientService.findAll();
    }

    public Client findClientById(@PathVariable Long id) {
        return this.clientService.findClientById(id);
    }

    public Client create(@RequestBody Client client) {
        return this.clientService.create(client);
    }

    public void delete(@PathVariable Long id) {
        this.clientService.delete(id);
    }

    public Client update(@RequestBody Client client) {
        return this.clientService.update(client);
    }
}
