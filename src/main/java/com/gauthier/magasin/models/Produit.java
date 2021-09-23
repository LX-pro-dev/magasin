package com.gauthier.magasin.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name= "prix")
    private Integer prix;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Categorie> category;

    @ManyToMany(mappedBy = "produits")
    private Set<Commande> commandes;

}
