package com.example.demo.controller;

import com.example.demo.dto.VaAtamaDTO;
import com.example.demo.service.VaAtamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vaatama")
public class VaAtamaController {

    @Autowired
    private VaAtamaService vaAtamaService;

    @GetMapping
    public List<VaAtamaDTO> getAll() {
        return vaAtamaService.findAll();
    }

    @GetMapping("/{id}")
    public VaAtamaDTO getById(@PathVariable Integer id) {
        return vaAtamaService.findById(id).orElse(null);
    }

    @PostMapping
    public VaAtamaDTO create(@RequestBody VaAtamaDTO dto) {
        return vaAtamaService.save(dto);
    }

    @PutMapping("/{id}")
    public VaAtamaDTO update(@PathVariable Integer id, @RequestBody VaAtamaDTO dto) {
        return vaAtamaService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        vaAtamaService.deleteById(id);
    }
}
