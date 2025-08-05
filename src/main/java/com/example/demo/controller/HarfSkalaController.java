package com.example.demo.controller;

import com.example.demo.dto.HarfSkalaDto;
import com.example.demo.service.HarfSkalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/harf-skala")
public class HarfSkalaController {

    @Autowired
    private HarfSkalaService harfSkalaService;

    @GetMapping
    public ResponseEntity<List<HarfSkalaDto>> getAll() {
        return ResponseEntity.ok(harfSkalaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HarfSkalaDto> getById(@PathVariable Integer id) {
        HarfSkalaDto dto = harfSkalaService.getById(id);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<HarfSkalaDto> create(@RequestBody HarfSkalaDto dto) {
        return ResponseEntity.ok(harfSkalaService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<HarfSkalaDto> update(@PathVariable Integer id, @RequestBody HarfSkalaDto dto) {
        HarfSkalaDto updated = harfSkalaService.update(id, dto);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        boolean deleted = harfSkalaService.delete(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
