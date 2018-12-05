package com.easysoft.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@NoArgsConstructor
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long clientId;
    private String nomClient;
    private String adresse;
    private String email;
    private String telephone;

    @OneToMany(mappedBy = "client")
    private Collection<Commande> commandes;
}
