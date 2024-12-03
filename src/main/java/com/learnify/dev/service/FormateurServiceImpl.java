package com.learnify.dev.service;

import com.learnify.dev.entity.ConfirmationToken;
import com.learnify.dev.entity.Formateur;
import com.learnify.dev.entity.Formateur;
import com.learnify.dev.repository.FormateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormateurServiceImpl implements FormateurService {
    @Autowired
    FormateurRepository formateurRepository;

    @Override
    public Formateur ajouterFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    @Override
    public Formateur modifierFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    @Override
    public List<Formateur> afficherFormateur() {
        return formateurRepository.findAll();
    }

    @Override
    public Optional<Formateur> afficherFormateurById(Long id) {
        return formateurRepository.findById(id);
    }

    @Override
    public void supprimerFormateur(Long id) {
        formateurRepository.deleteById(id);

    }

    @Override
    public ResponseEntity<?> confirmationEmail(String confirmationToken) {
        return null;
    }
}
