package com.learnify.dev.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@NotBlank
    private String name;
    //@NotBlank
    private String categoryCo;
    //@NotBlank
    private String dure;
    //@NotNull
    private String formateur;
    //@NotNull
    private String descCo;
    @Lob
    private String image;
    //@NotBlank
    private  Float prix;
}
