package com.example.demo.controller;

import com.example.demo.dto.DonemDTO;
import com.example.demo.service.DonemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donem")
public class DonemController {

    @Autowired
    private DonemService donemService;

    @GetMapping
    public ResponseEntity<List<DonemDTO>> getAll() {
        List<DonemDTO> donemler = donemService.getAll();
        return ResponseEntity.ok(donemler);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonemDTO> getById(@PathVariable Integer id) {
        return donemService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DonemDTO> create(@RequestBody DonemDTO dto) {
        DonemDTO created = donemService.save(dto);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DonemDTO> update(@PathVariable Integer id, @RequestBody DonemDTO dto) {
        try {
            DonemDTO updated = donemService.update(id, dto);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        donemService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
