	package com.example.demo.controller;

import com.example.demo.dto.OrgDTO;
import com.example.demo.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/org")
public class OrgController {

    @Autowired
    private OrgService orgService;

    @GetMapping
    public List<OrgDTO> getAll() {
        return orgService.findAll();
    }

    @GetMapping("/{id}")
    public OrgDTO getById(@PathVariable Integer id) {
        return orgService.findById(id).orElse(null);
    }

    @PostMapping
    public OrgDTO create(@RequestBody OrgDTO dto) {
        return orgService.save(dto);
    }

    @PutMapping("/{id}")
    public OrgDTO update(@PathVariable Integer id, @RequestBody OrgDTO dto) {
        return orgService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        orgService.deleteById(id);
    }
}
