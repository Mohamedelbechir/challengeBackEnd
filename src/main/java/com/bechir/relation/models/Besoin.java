package com.bechir.relation.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Besoin  implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private LocalDate date = LocalDate.now();
    private String description;
    private String statut;
    private AppelOffre appelOffre;
    private List<Source> sources;
    private LocalDate dateEnvoie;

}