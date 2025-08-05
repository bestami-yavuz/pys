package com.example.demo.repository;

import com.example.demo.entity.SorularAktarim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SorularAktarimRepository extends JpaRepository<SorularAktarim, Integer> {
}

