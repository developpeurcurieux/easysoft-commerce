package com.easysoft.service;

import com.easysoft.models.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Internaute {
    public List<Categorie> listCategories();
    public Categorie getCategorie(Long categorieId);

    public List<Produit> listProduits();
    public Page<Produit> produitsParMotCle(String motCle, Pageable pageable);
    public List<Produit> produitsParCategorie(Long categorieId);
    public List<Produit> produitsSelectionnes();
    public Produit getProduit(Long produitId);

    public Commande enregistrerCommande(Panier panier, Client client);
}
