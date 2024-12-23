package com.UtilisateurService.Utilisateur_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Utilisateur {
    @Id
    private Long idUtilisateur;
    private String nomUtilisateur;
    private String motDePasse;
    private String role; // Administrateur, Gestionnaire de Stock, Utilisateur
}
