package com.example.demo.repository;

import com.example.demo.entity.Sorular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SorularRepository extends JpaRepository<Sorular, Integer> {

    // Örnek: Ekstra sorgular yazmak istersen buraya ekleyebilirsin
    // List<PysSorular> findByTip(String tip);
}
