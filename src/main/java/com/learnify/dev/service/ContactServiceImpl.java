package com.learnify.dev.service;

import com.learnify.dev.entity.ConfirmationToken;
import com.learnify.dev.entity.Contact;
import com.learnify.dev.entity.Participant;
import com.learnify.dev.repository.ContactRepository;
import com.learnify.dev.repository.ParticipantRepository;
import com.learnify.dev.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact ajouterContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public void supprimerContact(Long id) {
        contactRepository.deleteById(id);

    }

    @Override
    public List<Contact> afficherContact() {
        return contactRepository.findAll();
    }
}
