package com.gauthier.magasin.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @ManyToOne
    @JoinColumn(name="produit_id", referencedColumnName = "id")
    private Produit produit;
}
