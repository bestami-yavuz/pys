package com.example.demo.service;

import com.example.demo.entity.UniteSonucOnay;
import com.example.demo.repository.UniteSonucOnayRepository;
import com.example.demo.dto.UniteSonucOnayDTO;
import com.example.demo.mapper.UniteSonucOnayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UniteSonucOnayService {

    @Autowired
    private UniteSonucOnayRepository repository;

    @Autowired
    private UniteSonucOnayMapper mapper;

    public List<UniteSonucOnayDTO> findAll() {
        List<UniteSonucOnay> entities = repository.findAll();
        return entities.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<UniteSonucOnayDTO> findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto);
    }

    public UniteSonucOnayDTO save(UniteSonucOnayDTO dto) {
        UniteSonucOnay entity = mapper.toEntity(dto);
        UniteSonucOnay saved = repository.save(entity);
        return mapper.toDto(saved);
    }

    public UniteSonucOnayDTO update(Integer id, UniteSonucOnayDTO dto) {
        UniteSonucOnay entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kayıt bulunamadı"));
        entity.setSonucOnayId(id);
        mapper.updateEntityFromDto(dto, entity);
        UniteSonucOnay updated = repository.save(entity);
        return mapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
