package com.example.demo.repository;

import com.example.demo.entity.Skala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkalaRepository extends JpaRepository<Skala, Integer> {

    // Örnek: Tanım numarasına göre listeleme
    // List<PysSkala> findBySkalaTanimNo(Integer tanimNo);

}
