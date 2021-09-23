package com.gauthier.magasin.configs;

import com.gauthier.magasin.repositories.CategorieRepository;
import com.gauthier.magasin.services.CategorieService;
import com.gauthier.magasin.services.impl.CategorieServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategorieConfig {

    @Bean
    CategorieService categorieService(CategorieRepository categorieRepository) {
        return new CategorieServiceImpl(categorieRepository);
    }
}
