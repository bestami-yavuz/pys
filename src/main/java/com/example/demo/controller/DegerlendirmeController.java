package com.example.demo.controller;

import com.example.demo.dto.DegerlendirmeDTO;
import com.example.demo.service.DegerlendirmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/degerlendirme")
public class DegerlendirmeController {
    @Autowired
    private DegerlendirmeService degerlendirmeService;

    @GetMapping
    public List<DegerlendirmeDTO> getAll() {
        return degerlendirmeService.findAll();
    }

    @GetMapping("/{id}")
    public DegerlendirmeDTO getById(@PathVariable Integer id) {
        Optional<DegerlendirmeDTO> dto = degerlendirmeService.findById(id);
        return dto.orElse(null);
    }

    @PostMapping
    public DegerlendirmeDTO create(@RequestBody DegerlendirmeDTO dto) {
        return degerlendirmeService.save(dto);
    }

    @PutMapping("/{id}")
    public DegerlendirmeDTO update(@PathVariable Integer id, @RequestBody DegerlendirmeDTO dto) {
        return degerlendirmeService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        degerlendirmeService.deleteById(id);
    }
}
