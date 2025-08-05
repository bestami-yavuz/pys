package com.example.demo.controller;

import com.example.demo.dto.GbOnayDurumuDTO;
import com.example.demo.service.GbOnayDurumuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gbonaydurumu")
public class GbOnayDurumuController {
    @Autowired
    private GbOnayDurumuService gbOnayDurumuService;

    @GetMapping
    public List<GbOnayDurumuDTO> getAll() {
        return gbOnayDurumuService.findAll();
    }

    @GetMapping("/{id}")
    public GbOnayDurumuDTO getById(@PathVariable Integer id) {
        Optional<GbOnayDurumuDTO> dto = gbOnayDurumuService.findById(id);
        return dto.orElse(null);
    }

    @PostMapping
    public GbOnayDurumuDTO create(@RequestBody GbOnayDurumuDTO dto) {
        return gbOnayDurumuService.save(dto);
    }

    @PutMapping("/{id}")
    public GbOnayDurumuDTO update(@PathVariable Integer id, @RequestBody GbOnayDurumuDTO dto) {
        return gbOnayDurumuService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        gbOnayDurumuService.deleteById(id);
    }
}
