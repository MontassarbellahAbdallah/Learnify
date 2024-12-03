package com.learnify.dev.repository;

import com.learnify.dev.entity.Cour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourRepository extends JpaRepository<Cour, Long> {
    Cour findCourByName(String titreCo);
}
