package com.example.demo.repository;

import com.example.demo.entity.HarfSkalaTanim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HarfSkalaTanimRepository extends JpaRepository<HarfSkalaTanim, Integer> {
    // Örnek özel sorgu (istersen)
    // List<HarfSkalaTanim> findByTesis(String tesis);
}
