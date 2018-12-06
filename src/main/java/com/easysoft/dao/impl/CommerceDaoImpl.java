package com.easysoft.dao.impl;

import com.easysoft.dao.CommerceDao;
import com.easysoft.dao.repository.*;
import com.easysoft.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class CommerceDaoImpl implements CommerceDao {
    @Autowired
    private CategorieRepository categorieRepository;
    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private LigneCommandeRepository ligneCommandeRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Categorie addCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);

    }

    @Override
    public List<Categorie> listCategories() {

        return categorieRepository.findAll();

    }

    @Override
    public Categorie getCategorie(Long categorieId) {

        return categorieRepository.findById(categorieId).get();

    }

    @Override
    public void deleteCategorie(Long categorieId) {

        categorieRepository.deleteById(categorieId);


    }

    @Override
    public void updateCategorie(Categorie categorie) {

        categorieRepository.save(categorie);
    }

    @Override
    public Produit addProduit(Produit produit, Long categorieId) {
        Categorie categorie = categorieRepository.findById(categorieId).get();
        produit.setCategorie(categorie);
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> listProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Page<Produit> produitsByMotCle(String motCle, Pageable pageable) {
        return produitRepository.findByMotCle(motCle, pageable);
    }

    @Override
    public List<Produit> produitsByCategorie(Long categorieId) {
        return produitRepository.findByCategorie(categorieId);
    }

    @Override
    public List<Produit> produitsSelected() {
        return produitRepository.findSelected();
    }

    @Override
    public Produit getProduit(Long produitId) {
        return produitRepository.findById(produitId).get();
    }

    @Override
    public void deleteProduit(Long produitId) {
        produitRepository.deleteById(produitId);
    }

    @Override
    public void updateProduit(Produit produit) {
        produitRepository.save(produit);
    }

    @Override
    public void ajouterUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void attributerRole(Role role, Long userId) {
        User user = userRepository.findById(userId).get();
        user.getRoles().add(role);
        userRepository.save(user);
    }

    @Override
    public Commande savePanier(Panier panier, Client client) {
        clientRepository.save(client);

        Commande commande = new Commande();
        commande.setDateCommande(new Date());
        commande.setItems(panier.getItems());

        for (LigneCommande ligneCommande : panier.getItems()) {
            ligneCommandeRepository.save(ligneCommande);
        }

        commandeRepository.save(commande);

        return commande;
    }
}
