package com.example.demo.repository;

import com.example.demo.entity.SkalaTanim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkalaTanimRepository extends JpaRepository<SkalaTanim, Integer> {

    // Örnek: Tesis adına göre sorgulama
    // List<PysSkalaTanim> findByTesis(String tesis);
}
