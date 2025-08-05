package com.example.demo.controller;

import com.example.demo.dto.DegSeviyeAgirlikDto;
import com.example.demo.service.DegSeviyeAgirlikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pys-deg-seviye-agirlik")
public class DegSeviyeAgirlikController {

    @Autowired
    private DegSeviyeAgirlikService service;

    // Tüm verileri getir
    @GetMapping
    public ResponseEntity<List<DegSeviyeAgirlikDto>> getAll() {
        List<DegSeviyeAgirlikDto> dtos = service.findAll();
        if (dtos.isEmpty()) {
            return ResponseEntity.noContent().build(); // İçerik yoksa 204 döner
        }
        return ResponseEntity.ok(dtos); // Başarılıysa 200 döner
    }

    // ID'ye göre veri getir
    @GetMapping("/{id}")
    public ResponseEntity<DegSeviyeAgirlikDto> getById(@PathVariable Integer id) {
        Optional<DegSeviyeAgirlikDto> dto = service.findById(id);
        if (dto.isEmpty()) {
            return ResponseEntity.notFound().build(); // Veri bulunamazsa 404 döner
        }
        return ResponseEntity.ok(dto.get()); // Başarılıysa 200 döner
    }

    // Yeni veri oluştur
    @PostMapping
    public ResponseEntity<DegSeviyeAgirlikDto> create(@RequestBody DegSeviyeAgirlikDto dto) {
        DegSeviyeAgirlikDto savedDto = service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDto); // Başarılıysa 201 döner
    }

    // Veriyi güncelle
    @PutMapping("/{id}")
    public ResponseEntity<DegSeviyeAgirlikDto> update(@PathVariable Integer id, @RequestBody DegSeviyeAgirlikDto dto) {
        DegSeviyeAgirlikDto updatedDto = service.update(id, dto);
        if (updatedDto == null) {
            return ResponseEntity.notFound().build(); // Veri bulunamazsa 404 döner
        }
        return ResponseEntity.ok(updatedDto); // Başarılıysa 200 döner
    }

    // Veriyi sil
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build(); // Başarılıysa 204 döner
    }
}
