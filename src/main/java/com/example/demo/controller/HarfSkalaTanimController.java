package com.example.demo.controller;

import com.example.demo.dto.HarfSkalaTanimDto;
import com.example.demo.service.HarfSkalaTanimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/harf-skala-tanim")

public class HarfSkalaTanimController {


    @Autowired
    private HarfSkalaTanimService service;

    @GetMapping
    public ResponseEntity<List<HarfSkalaTanimDto>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HarfSkalaTanimDto> getById(@PathVariable Integer id) {
        HarfSkalaTanimDto dto = service.getById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<HarfSkalaTanimDto> create(@RequestBody HarfSkalaTanimDto dto) {
        HarfSkalaTanimDto created = service.create(dto);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HarfSkalaTanimDto> update(@PathVariable Integer id, @RequestBody HarfSkalaTanimDto dto) {
        HarfSkalaTanimDto updated = service.update(id, dto);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        boolean deleted = service.delete(id);
        return deleted ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
