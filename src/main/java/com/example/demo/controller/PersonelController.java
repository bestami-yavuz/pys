package com.example.demo.controller;

import com.example.demo.dto.PersonelDTO;
import com.example.demo.service.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personel")
public class PersonelController {
    @Autowired
    private PersonelService personelService;

    @GetMapping
    public List<PersonelDTO> getAll() {
        return personelService.findAll();
    }

    @GetMapping("/{id}")
    public PersonelDTO getById(@PathVariable Integer id) {
        return personelService.findById(id).orElse(null);
    }

    @PostMapping
    public PersonelDTO create(@RequestBody PersonelDTO dto) {
        return personelService.save(dto);
    }

    @PutMapping("/{id}")
    public PersonelDTO update(@PathVariable Integer id, @RequestBody PersonelDTO dto) {
        return personelService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        personelService.deleteById(id);
    }
}
