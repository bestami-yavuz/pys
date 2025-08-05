package com.example.demo.repository;

import com.example.demo.entity.Unvan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnvanRepository extends JpaRepository<Unvan, Integer> {
}