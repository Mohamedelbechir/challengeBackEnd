package com.bechir.relation.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Conversation {
    private LocalDateTime date = LocalDateTime.now();
    private String contenu;    
}