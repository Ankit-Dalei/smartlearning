package com.example.smartlearning;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SmlRepo extends JpaRepository<UserSignup, Long> {
    Optional<UserSignup> findByUsername(String username);
    Optional<UserSignup> findByEmail(String email);
}
