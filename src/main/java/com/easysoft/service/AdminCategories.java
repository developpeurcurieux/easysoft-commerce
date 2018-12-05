package com.easysoft.service;

import com.easysoft.models.Categorie;
import com.easysoft.models.Role;
import com.easysoft.models.User;

public interface AdminCategories extends AdminProduits {
    public Categorie addCategorie(Categorie categorie);
    public void supprimerCategorie(Long categorieId);
    public void updateCategorie(Categorie categorie);
    public void ajouterUser(User user);
    public void attribuerRole(Role role, Long userId);
}
