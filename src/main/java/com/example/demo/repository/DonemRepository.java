package com.example.demo.repository;

import com.example.demo.entity.Donem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonemRepository extends JpaRepository<Donem, Integer> {
    
    // Gerekirse özel sorgular burada tanımlanabilir
}
