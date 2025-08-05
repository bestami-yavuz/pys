package com.example.demo.repository;

import com.example.demo.entity.GeriBildirim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeriBildirimRepository extends JpaRepository<GeriBildirim, Integer> {
}
