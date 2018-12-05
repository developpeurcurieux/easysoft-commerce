package com.easysoft.service;

import com.easysoft.models.*;

import java.util.List;

public interface Internaute {
    public List<Categorie> listCategories();
    public Categorie getCategorie(Long categorieId);

    public List<Produit> listProduits();
    public List<Produit> produitsParMotCle(String motCle);
    public List<Produit> produitsParCategorie(Long categorieId);
    public List<Produit> produitsSelectionnes();
    public Produit getProduit(Long porduitId);

    public Commande enregistrerCommande(Panier panier, Client client);
}
