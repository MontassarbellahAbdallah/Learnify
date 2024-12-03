package com.learnify.dev.repository;


import com.learnify.dev.entity.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormateurRepository extends JpaRepository<Formateur, Long> {
    Formateur findFormateurByEmail(String email);
    Formateur findByEmail(String email);
}
