package com.learnify.dev.service;

import com.learnify.dev.entity.Formateur;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface FormateurService {
    Formateur ajouterFormateur(Formateur formateur);

    Formateur modifierFormateur(Formateur formateur);

    List<Formateur> afficherFormateur();

    Optional<Formateur> afficherFormateurById(Long id);

    void supprimerFormateur(Long id);

    ResponseEntity<?> confirmationEmail(String confirmationToken);
}
