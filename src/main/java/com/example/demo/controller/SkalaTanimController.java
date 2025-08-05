package com.example.demo.controller;

import com.example.demo.dto.SkalaTanimDto;
import com.example.demo.service.SkalaTanimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skala-tanim")
public class SkalaTanimController {

    @Autowired
    private SkalaTanimService service;

    // Tüm kayıtları getir
    @GetMapping
    public ResponseEntity<List<SkalaTanimDto>> getAll() {
        List<SkalaTanimDto> list = service.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }

    // ID ile kayıt getir
    @GetMapping("/{id}")
    public ResponseEntity<SkalaTanimDto> getById(@PathVariable Integer id) {
        SkalaTanimDto dto = service.getById(id);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }

    // Yeni kayıt oluştur
    @PostMapping
    public ResponseEntity<SkalaTanimDto> create(@RequestBody SkalaTanimDto dto) {
        SkalaTanimDto created = service.create(dto);
        return ResponseEntity.status(201).body(created);
    }

    // Güncelle
    @PutMapping("/{id}")
    public ResponseEntity<SkalaTanimDto> update(@PathVariable Integer id, @RequestBody SkalaTanimDto dto) {
        SkalaTanimDto updated = service.update(id, dto);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    // Sil
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        boolean deleted = service.delete(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
