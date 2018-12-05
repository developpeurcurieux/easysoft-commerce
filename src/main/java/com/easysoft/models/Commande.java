package com.easysoft.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long commandeId;
    private Date dateCommande;

    @OneToMany(mappedBy="commande")
    private Collection<LigneCommande> items;

    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;
}
