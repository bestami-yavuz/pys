package com.example.demo.controller;

import com.example.demo.dto.SorularDto;
import com.example.demo.service.SorularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sorular")
public class SorularController {

    @Autowired
    private SorularService service;

    // Tüm soruları getir
    @GetMapping
    public List<SorularDto> getAllSorular() {
        return service.findAll();  // servis metod adı findAll olarak değişti
    }

    // ID'ye göre getir
    @GetMapping("/{id}")
    public Optional<SorularDto> getSoruById(@PathVariable Integer id) {
        return service.findById(id);  // servis metod adı findById
    }

    // Yeni soru ekle
    @PostMapping
    public SorularDto createSoru(@RequestBody SorularDto dto) {
        return service.save(dto);  // servis metod adı save
    }

    // Soru güncelle
    @PutMapping("/{id}")
    public SorularDto updateSoru(@PathVariable Integer id, @RequestBody SorularDto dto) {
        return service.update(id, dto);  // servis metod adı update
    }

    // Soru sil
    @DeleteMapping("/{id}")
    public void deleteSoru(@PathVariable Integer id) {
        service.delete(id);  // servis metod adı delete
    }
}
