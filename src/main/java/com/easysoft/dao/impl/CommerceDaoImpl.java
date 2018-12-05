package com.easysoft.dao.impl;

import com.easysoft.dao.CommerceDao;
import com.easysoft.models.*;

import java.util.List;

public class CommerceDaoImpl implements CommerceDao {
    @Override
    public Categorie addCategorie(Categorie categorie) {
        return null;
    }

    @Override
    public List<Categorie> listCategories() {
        return null;
    }

    @Override
    public Categorie getCategorie(Long categorieId) {
        return null;
    }

    @Override
    public void deleteCategorie(Long categorieId) {

    }

    @Override
    public void updateCategorie(Categorie categorie) {

    }

    @Override
    public Produit addProduit(Produit produit) {
        return null;
    }

    @Override
    public List<Produit> listProduits() {
        return null;
    }

    @Override
    public List<Produit> produitsByMotCle(String motCle) {
        return null;
    }

    @Override
    public List<Produit> produitsByCategorie(Long categorieId) {
        return null;
    }

    @Override
    public List<Produit> produitsSelected() {
        return null;
    }

    @Override
    public Produit getProduit(Long produitId) {
        return null;
    }

    @Override
    public void deleteProduit(Long produitId) {

    }

    @Override
    public void updateProduit(Long produitId) {

    }

    @Override
    public void ajouterUser(User user) {

    }

    @Override
    public void attributerRole(Role role, Long userId) {

    }

    @Override
    public Commande savePanier(Panier panier, Client client) {
        return null;
    }
}
