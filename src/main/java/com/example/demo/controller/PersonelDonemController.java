package com.example.demo.controller;

import com.example.demo.service.PersonelDonemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personeldonem")
public class PersonelDonemController {
    @Autowired
    private PersonelDonemService personelDonemService;

    @GetMapping
    public List<com.example.demo.dto.PersonelDonemDTO> getAll() {
        return personelDonemService.findAll();
    }

    @GetMapping("/{id}")
    public com.example.demo.dto.PersonelDonemDTO getById(@PathVariable Integer id) {
        return personelDonemService.findById(id).orElse(null);
    }

    @PostMapping
    public com.example.demo.dto.PersonelDonemDTO create(@RequestBody com.example.demo.dto.PersonelDonemDTO dto) {
        return personelDonemService.save(dto);
    }

    @PutMapping("/{id}")
    public com.example.demo.dto.PersonelDonemDTO update(@PathVariable Integer id, @RequestBody com.example.demo.dto.PersonelDonemDTO dto) {
        return personelDonemService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        personelDonemService.deleteById(id);
    }
}
