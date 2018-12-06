package com.easysoft.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@NoArgsConstructor
@Data
public class Categorie implements Serializable {
    @Id
    @GeneratedValue
    private Long categorieId;

    @NotEmpty
    @Size(min=4, max=20)
    private String nomCategorie;

    @Size(min=5)
    private String description;

    @Lob
    private byte[] photo;

    private String nomPhoto;

    @OneToMany(mappedBy="categorie")
    @JsonBackReference
    private Collection<Produit> produits;

    public Categorie(String nomCategorie, String description, byte[] photo, String nomPhoto) {
        this.nomCategorie = nomCategorie;
        this.description = description;
        this.photo = photo;
        this.nomPhoto = nomPhoto;
    }
}
