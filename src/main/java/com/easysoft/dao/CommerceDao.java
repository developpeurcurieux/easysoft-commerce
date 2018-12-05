package com.easysoft.dao;

import com.easysoft.models.*;

import java.util.List;

public interface CommerceDao {
    public Categorie addCategorie(Categorie categorie);
    public List<Categorie> listCategories();
    public Categorie getCategorie(Long categorieId);
    public void deleteCategorie(Long categorieId);
    public void updateCategorie(Categorie categorie);

    public Produit addProduit(Produit produit);
    public List<Produit> listProduits();
    public List<Produit> produitsByMotCle(String motCle);
    public List<Produit> produitsByCategorie(Long categorieId);
    public List<Produit> produitsSelected();
    public Produit getProduit(Long produitId);
    public void deleteProduit(Long produitId);
    public void updateProduit(Long produitId);

    public void ajouterUser(User user);
    public void attributerRole(Role role, Long userId);

    public Commande savePanier(Panier panier, Client client);
}
