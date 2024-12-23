package com.FactureService.Facture_service.model;

import com.CommandeService.Commande_service.model.Commande;
import com.FournisseurService.Fournisseur_service.model.Fournisseur;
import com.CientService.client_service.model.Client;
import com.ProduitService.Produit_service.model.Produit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Facture {
    @Id
    private Long idFacture;
    private Date dateFacture;
    private Fournisseur fournisseur;
    private Client client;
    private List<Commande> commandes; // Liste des commandes livrées
    private Map<Produit, Integer> produitsAdditionnels; // Produits supplémentaires livrés et leurs quantités
    private Double montantTotal;
}
