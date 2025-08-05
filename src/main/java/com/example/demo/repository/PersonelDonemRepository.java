package com.example.demo.repository;

import com.example.demo.entity.PersonelDonem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelDonemRepository extends JpaRepository<PersonelDonem, Integer> {
}
