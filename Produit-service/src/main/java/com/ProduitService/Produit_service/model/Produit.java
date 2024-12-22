package com.ProduitService.Produit_service.model;
import com.GestionDinventaire.StockService.model.Stock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
public class Produit {
    Stock stock;

}
