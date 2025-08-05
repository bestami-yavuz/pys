package com.example.demo.controller;

import com.example.demo.dto.OrgSeviyeTanimDTO;
import com.example.demo.service.OrgSeviyeTanimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/org-seviye-tanim")
public class OrgSeviyeTanimController {

    @Autowired
    private OrgSeviyeTanimService service;

    @GetMapping
    public ResponseEntity<List<OrgSeviyeTanimDTO>> getAll() {
        List<OrgSeviyeTanimDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrgSeviyeTanimDTO> getById(@PathVariable Integer id) {
        OrgSeviyeTanimDTO dto = service.findById(id);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<OrgSeviyeTanimDTO> create(@RequestBody OrgSeviyeTanimDTO dto) {
        OrgSeviyeTanimDTO created = service.save(dto);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrgSeviyeTanimDTO> update(@PathVariable Integer id, @RequestBody OrgSeviyeTanimDTO dto) {
        if (!id.equals(dto.getOrgSeviyeId())) {
            return ResponseEntity.badRequest().build();
        }
        OrgSeviyeTanimDTO updated = service.save(dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        boolean deleted = service.deleteById(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
