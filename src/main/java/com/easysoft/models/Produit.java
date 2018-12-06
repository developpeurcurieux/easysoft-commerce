package com.easysoft.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Data
public class Produit implements Serializable {
    @Id
    @GeneratedValue
    private Long produitId;

    @NotEmpty
    private String designation;

    private String description;
    private double prix;
    private boolean selected;
    private String photo;
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "ID_CAT")
    @JsonManagedReference
    private Categorie categorie;

    public Produit(String designation, String description, double prix, boolean selected, String photo, int quantite) {
        this.designation = designation;
        this.description = description;
        this.prix = prix;
        this.selected = selected;
        this.photo = photo;
        this.quantite = quantite;
    }
}