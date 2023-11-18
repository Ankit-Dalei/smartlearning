package com.example.smartlearning;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryInterface extends JpaRepository<History, Long> {
}
