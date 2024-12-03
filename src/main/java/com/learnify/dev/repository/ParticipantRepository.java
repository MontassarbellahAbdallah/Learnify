package com.learnify.dev.repository;

import com.learnify.dev.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    Participant findParticipantByEmail(String email);
    Participant findByEmail(String email);
}
