package com.example.demo.controller;

import com.example.demo.dto.ParametrelerDTO;
import com.example.demo.service.ParametrelerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/parametreler")
public class ParametrelerController {

    @Autowired
    private ParametrelerService parametrelerService;

    // Tümünü getir
    @GetMapping
    public ResponseEntity<List<ParametrelerDTO>> getAll() {
        List<ParametrelerDTO> dtoList = parametrelerService.findAll();
        return ResponseEntity.ok(dtoList);
    }

    // ID ile getir
    @GetMapping("/{id}")
    public ResponseEntity<ParametrelerDTO> getById(@PathVariable Integer id) {
        Optional<ParametrelerDTO> optional = parametrelerService.findById(id);
        return optional.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Kaydet
    @PostMapping
    public ResponseEntity<ParametrelerDTO> save(@RequestBody ParametrelerDTO dto) {
        ParametrelerDTO saved = parametrelerService.save(dto);
        return ResponseEntity.ok(saved);
    }

    // Güncelle
    @PutMapping("/{id}")
    public ResponseEntity<ParametrelerDTO> update(@PathVariable Integer id, @RequestBody ParametrelerDTO dto) {
        ParametrelerDTO updated = parametrelerService.update(id, dto);
        return ResponseEntity.ok(updated);
    }

    // Sil
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        parametrelerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
