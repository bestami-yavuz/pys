package com.example.demo.controller;

import com.example.demo.dto.UniteSonucOnayDTO;
import com.example.demo.service.UniteSonucOnayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/unite-sonuc-onay")
public class UniteSonucOnayController {

    @Autowired
    private UniteSonucOnayService service;

    @GetMapping
    public List<UniteSonucOnayDTO> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public UniteSonucOnayDTO getById(@PathVariable Integer id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public UniteSonucOnayDTO create(@RequestBody UniteSonucOnayDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public UniteSonucOnayDTO update(@PathVariable Integer id, @RequestBody UniteSonucOnayDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}