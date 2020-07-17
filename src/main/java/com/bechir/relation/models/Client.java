package com.bechir.relation.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Client {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String statut;
    private LocalDate rappel;
    private String titre;
    private String email;
    private Long telephoneU;
    private Long telephoneD;
    private Long telephoneM;
    private String linkedIn;
    private String observation;
    private String techOutils;
    private List<String> pushs = new ArrayList<>();
    /*
     * private String pushU; private String pushBackEnd; private String pushLgProg;
     */
    private Plaquette plaquette;
    private List<Conversation> conversations = new ArrayList<>();
    private List<Besoin> besoins = new ArrayList<>();
    private Entreprise entreprise;
}