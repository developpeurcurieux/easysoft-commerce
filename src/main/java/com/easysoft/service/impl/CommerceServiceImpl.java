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
        return dao.addCategorie(categorie);
    }

    @Override
    public void supprimerCategorie(Long categorieId) {
        dao.deleteCategorie(categorieId);
    }

    @Override
    public void updateCategorie(Categorie categorie) {
        dao.updateCategorie(categorie);
    }

    @Override
    public void ajouterUser(User user) {
        dao.ajouterUser(user);
    }

    @Override
    public void attribuerRole(Role role, Long userId) {
        dao.attributerRole(role, userId);
    }

    @Override
    public Produit addProduit(Produit produit, Long categorieId) {
        return dao.addProduit(produit, categorieId);
    }

    @Override
    public void supprimerProduit(Long produitId) {
        dao.deleteProduit(produitId);
    }

    @Override
    public void updateProduit(Produit produit) {
        dao.updateProduit(produit);
    }

    @Override
    public List<Categorie> listCategories() {
        return dao.listCategories();
    }

    @Override
    public Categorie getCategorie(Long categorieId) {
        return dao.getCategorie(categorieId);
    }

    @Override
    public List<Produit> listProduits() {
        return dao.listProduits();
    }

    @Override
    public List<Produit> produitsParMotCle(String motCle) {
        return dao.produitsByMotCle(motCle);
    }

    @Override
    public List<Produit> produitsParCategorie(Long categorieId) {
        return dao.produitsByCategorie(categorieId);
    }

    @Override
    public List<Produit> produitsSelectionnes() {
        return dao.produitsSelected();
    }

    @Override
    public Produit getProduit(Long produitId) {
        return dao.getProduit(produitId);
    }

    @Override
    public Commande enregistrerCommande(Panier panier, Client client) {
        return dao.savePanier(panier, client);
    }
}
