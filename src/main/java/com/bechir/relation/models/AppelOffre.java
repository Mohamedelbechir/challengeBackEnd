package com.bechir.relation.models;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppelOffre {
    private String etatOffre;
    @DBRef
    private Fichier fichier;
}