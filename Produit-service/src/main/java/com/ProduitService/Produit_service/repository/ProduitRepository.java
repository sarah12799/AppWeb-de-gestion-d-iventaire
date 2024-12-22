package com.ProduitService.Produit_service.repository;

import com.ProduitService.Produit_service.model.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProduitRepository extends MongoRepository<Produit,Long> {
}
