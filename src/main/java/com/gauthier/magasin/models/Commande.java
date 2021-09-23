package com.gauthier.magasin.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name= "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "client_id", referencedColumnName = "id")
    private Client client;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="commande_has_produits",
            joinColumns = @JoinColumn(name="commande_id"),
            inverseJoinColumns = @JoinColumn(name="produit_id")
    )
    private Set<Produit> produits;
}
