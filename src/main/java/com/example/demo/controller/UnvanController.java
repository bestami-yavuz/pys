package com.example.demo.controller;

import com.example.demo.dto.UnvanDTO;
import com.example.demo.service.UnvanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/unvan")
public class UnvanController {

    @Autowired
    private UnvanService unvanService;

    @GetMapping
    public List<UnvanDTO> getAll() {
        return unvanService.findAll();
    }

    @GetMapping("/{id}")
    public UnvanDTO getById(@PathVariable Integer id) {
        return unvanService.findById(id).orElse(null);
    }

    @PostMapping
    public UnvanDTO create(@RequestBody UnvanDTO dto) {
        return unvanService.save(dto);
    }

    @PutMapping("/{id}")
    public UnvanDTO update(@PathVariable Integer id, @RequestBody UnvanDTO dto) {
        return unvanService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        unvanService.deleteById(id);
    }
}
