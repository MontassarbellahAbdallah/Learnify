package com.learnify.dev.repository;

import com.learnify.dev.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    boolean existsByEmail(String email);

    Admin findAdminByEmail(String email);
}
