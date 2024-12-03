package com.learnify.dev.service;

import com.learnify.dev.entity.Admin;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    Admin ajouterAdmin(Admin admin);
    Admin modifierAdmin(Admin admin);
    void supprimerAdmin(Long id);
    List<Admin> afficherAdmin();
    Optional<Admin> affchierAdminById(Long id);
}
