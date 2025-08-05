package com.example.demo.controller;

import com.example.demo.dto.DoLogDTO;
import com.example.demo.service.DoLogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dolog")
public class DoLogController {

    @Autowired
    private DoLogService doLogService;

    @GetMapping
    public ResponseEntity<List<DoLogDTO>> getAll() {
        // Burada artık List<DoLogDTO> dönüyoruz
        List<DoLogDTO> logs = doLogService.getAll(); 
        return ResponseEntity.ok(logs);  // Dönen veriyi doğrudan DTO listesi olarak gönderiyoruz
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoLogDTO> getById(@PathVariable Integer id) {
        DoLogDTO dto = doLogService.getById(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<DoLogDTO> create(@RequestBody DoLogDTO dto) {
        DoLogDTO saved = doLogService.save(dto);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoLogDTO> update(@PathVariable Integer id, @RequestBody DoLogDTO dto) {
        DoLogDTO updated = doLogService.update(id, dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        doLogService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
