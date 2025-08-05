package com.example.demo.controller;

import com.example.demo.dto.SorularAktarimDTO;
import com.example.demo.service.SorularAktarimService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sorular-aktarim")
public class SorularAktarimController {

    @Autowired
    private SorularAktarimService sorularAktarimService;

    @GetMapping
    public List<SorularAktarimDTO> getAll() {
        return sorularAktarimService.findAll();
    }

    @GetMapping("/{id}")
    public SorularAktarimDTO getById(@PathVariable Integer id) {
        Optional<SorularAktarimDTO> dto = sorularAktarimService.findById(id);
        return dto.orElse(null);
    }

    @PostMapping
    public SorularAktarimDTO create(@RequestBody SorularAktarimDTO dto) {
        return sorularAktarimService.save(dto);
    }

    @PutMapping("/{id}")
    public SorularAktarimDTO update(@PathVariable Integer id, @RequestBody SorularAktarimDTO dto) {
        return sorularAktarimService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        sorularAktarimService.deleteById(id);
    }
}
