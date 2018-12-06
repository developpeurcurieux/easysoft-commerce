package com.easysoft.service;

import com.easysoft.models.Produit;

public interface AdminProduits extends Internaute {
    public Produit addProduit(Produit produit, Long categorieId);
    public void supprimerProduit(Long produitId);
    public void updateProduit(Produit produit);
}
