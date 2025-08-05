package com.example.demo.repository;

import com.example.demo.entity.VaAtama;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaAtamaRepository extends JpaRepository<VaAtama, Integer> {

    // Gerekirse özel sorgular burada tanımlanabilir

}
