package com.learnify.dev.service;

import com.learnify.dev.entity.Participant;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ParticipantService {
    ResponseEntity<?> confirmationEmail(String confirmationToken);

    Participant ajouterParticipant(Participant participant);

    Participant modifierParticipant(Participant participant);

    List<Participant> afficherParticipant();

    Optional<Participant> afficherParticipantById(Long id);

    void supprimerParticipant(Long id);
}
