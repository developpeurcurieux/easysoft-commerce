package com.easysoft.service.impl;

import com.easysoft.dao.CommerceDao;
import com.easysoft.models.*;
import com.easysoft.service.AdminCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommerceServiceImpl implements AdminCategories {

    @Autowired
    private CommerceDao dao;

    @Override
    public Categorie addCategorie(Categorie categorie) {
        return null;
    }

    @Override
    public void supprimerCategorie(Long categorieId) {

    }

    @Override
    public void updateCategorie(Categorie categorie) {

    }

    @Override
    public void ajouterUser(User user) {

    }

    @Override
    public void attribuerRole(Role role, Long userId) {

    }

    @Override
    public Produit addProduit(Produit produit, Long categorieId) {
        return null;
    }

    @Override
    public void supprimerProduit(Long produitId) {

    }

    @Override
    public void updateProduit(Produit produit) {

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
    public List<Produit> listProduits() {
        return null;
    }

    @Override
    public List<Produit> produitsParMotCle(String motCle) {
        return null;
    }

    @Override
    public List<Produit> produitsParCategorie(Long categorieId) {
        return null;
    }

    @Override
    public List<Produit> produitsSelectionnes() {
        return null;
    }

    @Override
    public Produit getProduit(Long porduitId) {
        return null;
    }

    @Override
    public Commande enregistrerCommande(Panier panier, Client client) {
        return null;
    }
}
