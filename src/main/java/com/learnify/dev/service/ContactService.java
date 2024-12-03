package com.learnify.dev.service;

import com.learnify.dev.entity.Contact;

import java.util.List;

public interface ContactService {
    Contact ajouterContact(Contact contact);
    void supprimerContact(Long id);
    List<Contact> afficherContact();
}
