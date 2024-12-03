package com.learnify.dev.service;

import com.learnify.dev.entity.Participant;
import com.learnify.dev.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ParticipantServiceImpl implements ParticipantService{

    @Autowired
    ParticipantRepository participantRepository;
    @Override
    public ResponseEntity<?> confirmationEmail(String confirmationToken) {
        return null;
    }

    @Override
    public Participant ajouterParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public Participant modifierParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public List<Participant> afficherParticipant() {
        return participantRepository.findAll();
    }

    @Override
    public Optional<Participant> afficherParticipantById(Long id) {
        return participantRepository.findById(id);
    }

    @Override
    public void supprimerParticipant(Long id) {
        participantRepository.deleteById(id);

    }
}
