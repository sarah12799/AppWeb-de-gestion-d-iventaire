package com.ProduitService.Produit_service.model;
import com.GestionDinventaire.StockService.model.Stock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Produit {
    Stock stock;
    Long idProduit;
    String nom;
    Double prixUnitaire;
    Integer seuilCritique;
    Date dateAjout;


}
