package com.bechir.relation.models;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Plaquette {
    private LocalDate date;
    private String libele;
    @DBRef
    private Fichier fichier;

}