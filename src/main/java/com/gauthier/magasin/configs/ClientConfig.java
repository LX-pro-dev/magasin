package com.gauthier.magasin.configs;

import com.gauthier.magasin.repositories.ClientRepository;
import com.gauthier.magasin.services.ClientService;
import com.gauthier.magasin.services.impl.ClientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {
    @Bean
    public ClientService clientService(ClientRepository clientRepository) {
        return new ClientServiceImpl(clientRepository);
    }
}
