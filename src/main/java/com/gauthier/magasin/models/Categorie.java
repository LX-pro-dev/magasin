package com.gauthier.magasin.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

//    @OneToMany
//    @JoinColumn(name="produit_id", referencedColumnName = "id")
//    private Set<Produit> produits;
}
