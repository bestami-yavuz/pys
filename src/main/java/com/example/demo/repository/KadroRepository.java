package com.example.demo.repository;

import com.example.demo.entity.Kadro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KadroRepository extends JpaRepository<Kadro, Integer> {
    // Gerekirse özelleştirilmiş sorgular buraya eklenebilir
}
