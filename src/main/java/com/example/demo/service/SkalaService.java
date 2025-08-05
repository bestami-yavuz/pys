package com.example.demo.service;

import com.example.demo.dto.SkalaDto;
import com.example.demo.entity.Skala;
import com.example.demo.mapper.SkalaMapper;
import com.example.demo.repository.SkalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkalaService {

    private final SkalaRepository repository;
    private final SkalaMapper mapper;

    public SkalaService(SkalaRepository repository, SkalaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    // Tüm skala kayıtlarını getir
    public List<SkalaDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    // Yeni skala kaydı oluştur
    public SkalaDto create(SkalaDto dto) {
        Skala entity = mapper.toEntity(dto);
        Skala saved = repository.save(entity);
        return mapper.toDto(saved);
    }

    // ID ile tek kayıt getir
    public SkalaDto getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);  // alternatif: custom exception fırlatılabilir
    }

    // Güncelle
    public SkalaDto update(Integer id, SkalaDto dto) {
        return repository.findById(id)
                .map(existing -> {
                    mapper.updateEntityFromDto(dto, existing); // Mevcut entity'yi dto ile güncelle
                    Skala updated = repository.save(existing);
                    return mapper.toDto(updated);
                })
                .orElse(null);
    }

    // Sil
    public boolean delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
