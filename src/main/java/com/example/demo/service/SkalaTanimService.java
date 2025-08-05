package com.example.demo.service;

import com.example.demo.dto.SkalaTanimDto;
import com.example.demo.entity.SkalaTanim;
import com.example.demo.mapper.SkalaTanimMapper;
import com.example.demo.repository.SkalaTanimRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkalaTanimService {

    private final SkalaTanimRepository repository;
    private final SkalaTanimMapper mapper;

    public SkalaTanimService(SkalaTanimRepository repository, SkalaTanimMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<SkalaTanimDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public SkalaTanimDto getById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

    public SkalaTanimDto create(SkalaTanimDto dto) {
        SkalaTanim entity = mapper.toEntity(dto);
        SkalaTanim saved = repository.save(entity);
        return mapper.toDto(saved);
    }

    public SkalaTanimDto update(Integer id, SkalaTanimDto dto) {
        return repository.findById(id)
                .map(existing -> {
                    mapper.updateEntityFromDto(dto, existing);
                    SkalaTanim updated = repository.save(existing);
                    return mapper.toDto(updated);
                })
                .orElse(null);
    }

    public boolean delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
