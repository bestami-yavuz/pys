package com.example.demo.repository;

import com.example.demo.entity.Parametreler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametrelerRepository extends JpaRepository<Parametreler, Integer> {
}
