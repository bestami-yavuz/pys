package com.example.demo.controller;

import com.example.demo.dto.SkalaDto;
import com.example.demo.service.SkalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skalalar")
public class SkalaController {

    @Autowired
    private SkalaService service;

    // Tüm skala kayıtlarını getir
    @GetMapping
    public List<SkalaDto> getAll() {
        return service.getAll();
    }

    // Tek skala kaydını getir
    @GetMapping("/{id}")
    public SkalaDto getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    // Yeni skala ekle
    @PostMapping
    public SkalaDto create(@RequestBody SkalaDto dto) {
        return service.create(dto);
    }

    // Güncelle
    @PutMapping("/{id}")
    public SkalaDto update(@PathVariable Integer id, @RequestBody SkalaDto dto) {
        return service.update(id, dto);
    }

    // Sil
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
