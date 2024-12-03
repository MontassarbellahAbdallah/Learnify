package com.learnify.dev.service;

import com.learnify.dev.entity.Cour;

import java.util.List;
import java.util.Optional;

public interface CourService {
    void supprimerCour(Long id);

    Cour modifierCour(Cour cour);

    Optional<Cour> afficherCourById(Long id);

    List<Cour> afficherCour();

    Cour ajouterCour(Cour cour);
}
