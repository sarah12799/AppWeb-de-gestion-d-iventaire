package com.ProduitService.Produit_service.model;
import com.GestionDinventaire.StockService.model.Stock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Produit {
    private Stock stock;
    @Id
    public Long idProduit;
    private String nom;
    private Double prixUnitaire;
    private Integer seuilCritique;
    private Date dateAjout;


}
