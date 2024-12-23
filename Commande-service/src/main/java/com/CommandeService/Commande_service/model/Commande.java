package com.CommandeService.Commande_service.model;



import com.ProduitService.Produit_service.model.Produit;
import com.FournisseurService.Fournisseur_service.model.Fournisseur;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Commande {
    @Id
    private Long idCommande;
    private Date dateCommande;
    private Double montantTotal;
    private String destination;
    private String etat; // "en cours", "livrée", "annulée"
    private List<Produit> produits;
    private Fournisseur fournisseur;
}