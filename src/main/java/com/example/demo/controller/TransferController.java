package com.example.demo.controller;
import com.example.demo.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transfer")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @GetMapping
    public List<com.example.demo.dto.TransferDTO> getAll() {
        return transferService.findAll();
    }

    @GetMapping("/{id}")
    public com.example.demo.dto.TransferDTO getById(@PathVariable Integer id) {
        return transferService.findById(id).orElse(null);
    }

    @PostMapping
    public com.example.demo.dto.TransferDTO create(@RequestBody com.example.demo.dto.TransferDTO dto) {
        return transferService.save(dto);
    }

    @PutMapping("/{id}")
    public com.example.demo.dto.TransferDTO update(@PathVariable Integer id, @RequestBody com.example.demo.dto.TransferDTO dto) {
        return transferService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        transferService.deleteById(id);
    }
}
