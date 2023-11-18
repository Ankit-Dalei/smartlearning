package com.example.smartlearning;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeInterface extends JpaRepository<Likes, Long> {
}
