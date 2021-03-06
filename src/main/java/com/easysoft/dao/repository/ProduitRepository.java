package com.easysoft.dao.repository;

import com.easysoft.models.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    @Query("select p from Produit p where p.designation like :x")
    public Page<Produit> findByMotCle(@Param("x") String motCle, Pageable pageable);

    @Query("select p from Produit p where p.categorie.categorieId = :x")
    public List<Produit> findByCategorie(@Param("x") Long categorieId);

    @Query("select p from Produit p where p.selected = true")
    public List<Produit> findSelected();
}
