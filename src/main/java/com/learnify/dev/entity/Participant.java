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
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomP;
    private String prenomP;
    private String emailP;
    private String mdpP;
    private Long numP;
    private String adresseP;
    private Boolean etat=false;

}
