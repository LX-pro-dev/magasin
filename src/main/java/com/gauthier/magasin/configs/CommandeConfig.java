package com.gauthier.magasin.configs;

import com.gauthier.magasin.repositories.CommandeRepository;
import com.gauthier.magasin.services.CommandeService;
import com.gauthier.magasin.services.impl.CommandeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandeConfig {
    @Bean
    CommandeService commandeService(CommandeRepository commandeRepository) {
        return new CommandeServiceImpl(commandeRepository);
    }
}
