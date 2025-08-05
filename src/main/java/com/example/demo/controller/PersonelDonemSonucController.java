package com.example.demo.controller;

import com.example.demo.service.PersonelDonemSonucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personeldonemsonuc")
public class PersonelDonemSonucController {
    @Autowired
    private PersonelDonemSonucService personelDonemSonucService;

    @GetMapping
    public List<com.example.demo.dto.PersonelDonemSonucDTO> getAll() {
        return personelDonemSonucService.findAll();
    }

    @GetMapping("/{id}")
    public com.example.demo.dto.PersonelDonemSonucDTO getById(@PathVariable Integer id) {
        return personelDonemSonucService.findById(id).orElse(null);
    }

    @PostMapping
    public com.example.demo.dto.PersonelDonemSonucDTO create(@RequestBody com.example.demo.dto.PersonelDonemSonucDTO dto) {
        return personelDonemSonucService.save(dto);
    }

    @PutMapping("/{id}")
    public com.example.demo.dto.PersonelDonemSonucDTO update(@PathVariable Integer id, @RequestBody com.example.demo.dto.PersonelDonemSonucDTO dto) {
        return personelDonemSonucService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        personelDonemSonucService.deleteById(id);
    }
}
