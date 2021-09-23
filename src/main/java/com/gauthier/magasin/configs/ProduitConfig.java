package com.gauthier.magasin.configs;

import com.gauthier.magasin.repositories.ProduitRepository;
import com.gauthier.magasin.services.ProduitService;
import com.gauthier.magasin.services.impl.ProduitServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProduitConfig {
    @Bean
    ProduitService produitService(ProduitRepository produitRepository) {
        return new ProduitServiceImpl(produitRepository);
    }
}
