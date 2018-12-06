package com.easysoft.web.controller;

import com.easysoft.models.Categorie;
import com.easysoft.models.Produit;
import com.easysoft.service.Internaute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InternauteController {
    @Autowired
    private Internaute metier;

    @GetMapping("/produits")
    public List<Produit> getProduits() {
        return metier.listProduits();
    }

    @GetMapping("/categories")
    public List<Categorie> getCategories() {
        return metier.listCategories();
    }

    @GetMapping("/produits/{id}")
    public Produit getProduit(@PathVariable("id") Long id) {
        return metier.getProduit(id);
    }

    @GetMapping("/chercherProduits")
    public Page<Produit> chercher(
            @RequestParam(value = "motCle", defaultValue = "") String motCle,
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "5") int size) {

        return metier.produitsParMotCle("%" + motCle + "%", PageRequest.of(page, size));
    }

    @GetMapping("/produitsParCategorie/{id}")
    public List<Produit> produitsParCategorie(@PathVariable("id") Long categorieId) {
        return metier.produitsParCategorie(categorieId);
    }


}
