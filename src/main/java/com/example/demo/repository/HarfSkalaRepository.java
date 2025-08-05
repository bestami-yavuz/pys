package com.example.demo.repository;


import com.example.demo.entity.HarfSkala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HarfSkalaRepository extends JpaRepository<HarfSkala, Integer> {

    // Örnek özel sorgu: belirli tanım numarasına göre listeleme
    // List<HarfSkala> findByHarfSkalaTanimNo(Integer tanimNo);
}
