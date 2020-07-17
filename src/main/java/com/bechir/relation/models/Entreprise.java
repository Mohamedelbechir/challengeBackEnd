package com.bechir.relation.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Entreprise {
    private String nomEnp;
    private String secteur;
    private String activite;
    private String droits;
    private String adresse;
    private Long codePostale;
    private String ville;
    private String notes;
    private Long telephoneEnpU;
    private Long telephoneEnpD;
    private String precisions;
    private String emailEnp;
    private String linkedInEnp;

}