package com.example.demo.controller;

import com.example.demo.dto.KadroDTO;
import com.example.demo.service.KadroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kadro")
public class KadroController {

    @Autowired
    private KadroService kadroService;

    // Tüm kayıtları getir
    @GetMapping
    public ResponseEntity<List<KadroDTO>> getAll() {
        List<KadroDTO> list = kadroService.findAll();
        return ResponseEntity.ok(list);
    }

    // ID ile kayıt getir
    @GetMapping("/{id}")
    public ResponseEntity<KadroDTO> getById(@PathVariable Integer id) {
        KadroDTO dto = kadroService.findById(id);
        return ResponseEntity.ok(dto);
    }

    // Yeni kayıt oluştur
    @PostMapping
    public ResponseEntity<KadroDTO> create(@RequestBody KadroDTO dto) {
        KadroDTO saved = kadroService.save(dto);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // Kayıt güncelle
    @PutMapping("/{id}")
    public ResponseEntity<KadroDTO> update(@PathVariable Integer id, @RequestBody KadroDTO dto) {
        KadroDTO updated = kadroService.update(id, dto);
        return ResponseEntity.ok(updated);
    }

    // Kayıt sil
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        kadroService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
