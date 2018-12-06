package com.easysoft;

import com.easysoft.models.Categorie;
import com.easysoft.models.Produit;
import com.easysoft.service.AdminCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyCommerceApplication implements CommandLineRunner {

	@Autowired
	private AdminCategories metier;

	public static void main(String[] args) {

		SpringApplication.run(EasyCommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categorie c01 = new Categorie("Ordinateurs", "pc portable", null, "image1.jpg");
		Categorie c02 = new Categorie("Imprimantes", "pc portable", null, "image2.jpg");
		Categorie c03 = new Categorie("Accessoires", "pc portable", null, "image3.jpg");


		Produit p01 = new Produit();
		p01.setDesignation("Dell XPS13");
		p01.setDescription("ordinateur pour Dev");
		p01.setPrix(1599);
		p01.setSelected(false);
		p01.setPhoto("dellXPS.jpg");
		p01.setQuantite(12);

		Produit p02 = new Produit();
		p02.setDesignation("Imprimante XPS13");
		p02.setDescription("Imprimante pour Dev");
		p02.setPrix(200);
		p02.setSelected(false);
		p02.setPhoto("dellXPS.jpg");
		p02.setQuantite(50);



		metier.addCategorie(c02);
		metier.addCategorie(c01);
		metier.addCategorie(c03);


		metier.addProduit(p01, c01.getCategorieId());
		metier.addProduit(p02, c02.getCategorieId());

		//System.out.println(metier.getCategorie(c01.getIdCategorie()));
		//Produit p02 = metier.getProduit(p01.getProduitId());
	}
}
