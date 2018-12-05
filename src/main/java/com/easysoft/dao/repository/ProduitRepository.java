package com.easysoft.dao.repository;

import com.easysoft.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Long, Produit> {
}
