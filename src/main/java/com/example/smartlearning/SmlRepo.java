package com.example.smartlearning;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SmlRepo extends JpaRepository<UserSignup, Long> {
}
