package com.example.demo.controller;

import com.example.demo.dto.GeriBildirimDTO;
import com.example.demo.service.GeriBildirimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/geribildirim")
public class GeriBildirimController {
    @Autowired
    private GeriBildirimService geriBildirimService;

    @GetMapping
    public List<GeriBildirimDTO> getAll() {
        return geriBildirimService.findAll();
    }

    @GetMapping("/{id}")
    public GeriBildirimDTO getById(@PathVariable Integer id) {
        Optional<GeriBildirimDTO> dto = geriBildirimService.findById(id);
        return dto.orElse(null);
    }

    @PostMapping
    public GeriBildirimDTO create(@RequestBody GeriBildirimDTO dto) {
        return geriBildirimService.save(dto);
    }

    @PutMapping("/{id}")
    public GeriBildirimDTO update(@PathVariable Integer id, @RequestBody GeriBildirimDTO dto) {
        return geriBildirimService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        geriBildirimService.deleteById(id);
    }
}
