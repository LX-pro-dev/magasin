package com.gauthier.magasin;

import com.gauthier.magasin.configs.CategorieConfig;
import com.gauthier.magasin.configs.ClientConfig;
import com.gauthier.magasin.configs.CommandeConfig;
import com.gauthier.magasin.configs.ProduitConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CategorieConfig.class, ClientConfig.class, CommandeConfig.class, ProduitConfig.class})
public class AppConfig { }
