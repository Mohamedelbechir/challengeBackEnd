package com.bechir.relation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Prestataire {
    @Id
    private String id;
    private String nom;
    private String prenom;
    @DBRef
    private Fichier cv;
    
}