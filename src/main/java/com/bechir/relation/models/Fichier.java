package com.bechir.relation.models;

import java.time.LocalDateTime;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fichier {
    @Id
    private String id;
    private String title;
    private Binary monFichier;
    private LocalDateTime date = LocalDateTime.now();
}