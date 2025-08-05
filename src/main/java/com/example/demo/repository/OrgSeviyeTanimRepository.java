package com.example.demo.repository;

import com.example.demo.entity.OrgSeviyeTanim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgSeviyeTanimRepository extends JpaRepository<OrgSeviyeTanim, Integer> {
    // Buraya özel sorgular ekleyebilirsin, şimdilik temel CRUD hazır.
}
