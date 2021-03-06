package com.easysoft.dao;

import com.easysoft.models.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CommerceDao {
    public Categorie addCategorie(Categorie categorie);
    public List<Categorie> listCategories();
    public Categorie getCategorie(Long categorieId);
    public void deleteCategorie(Long categorieId);
    public void updateCategorie(Categorie categorie);

    public Produit addProduit(Produit produit, Long categorieId);
    public List<Produit> listProduits();
    public Page<Produit> produitsByMotCle(String motCle, Pageable pageable);
    public List<Produit> produitsByCategorie(Long categorieId);
    public List<Produit> produitsSelected();
    public Produit getProduit(Long produitId);
    public void deleteProduit(Long produitId);

    public void updateProduit(Produit produit);
    public void ajouterUser(User user);
    public void attributerRole(Role role, Long userId);

    public Commande savePanier(Panier panier, Client client);
}
