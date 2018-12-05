package com.easysoft.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Data
public class LigneCommande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="ID_PRODUIT")
    private Produit produit;

    private int quantite;
    private double prix;

    @ManyToOne
    @JoinColumn(name="ID_COMMANDE")
    private Commande commande;
}
