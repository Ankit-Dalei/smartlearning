package com.example.smartlearning;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContentsRepo extends JpaRepository <Contents,Long> {
    List<Contents> findByCatagory(String catagory);
}
