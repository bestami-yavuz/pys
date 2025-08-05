package com.example.demo.repository;

import com.example.demo.entity.DoLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoLogRepository extends JpaRepository<DoLog, Integer> {
}
