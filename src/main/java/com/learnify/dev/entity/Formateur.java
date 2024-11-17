package com.learnify.dev.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Formateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomF;
    private String prenomF;
    private String emailF;
    private String mdpF;
    private Long numF;
    private String adresseF;
    private Boolean etat=false;
}
