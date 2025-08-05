package com.example.demo.service;

import com.example.demo.dto.SorularDto;
import com.example.demo.entity.Sorular;
import com.example.demo.mapper.SorularMapper;
import com.example.demo.repository.SorularRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SorularService {

    private final SorularRepository sorularRepository;
    private final SorularMapper sorularMapper;

    public SorularService(SorularRepository sorularRepository, SorularMapper sorularMapper) {
        this.sorularRepository = sorularRepository;
        this.sorularMapper = sorularMapper;
    }

    public List<SorularDto> findAll() {
        return sorularRepository.findAll()
                .stream()
                .map(sorularMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<SorularDto> findById(Integer id) {
        return sorularRepository.findById(id)
                .map(sorularMapper::toDto);
    }

    public SorularDto save(SorularDto dto) {
        Sorular entity = sorularMapper.toEntity(dto);
        Sorular saved = sorularRepository.save(entity);
        return sorularMapper.toDto(saved);
    }

    public SorularDto update(Integer id, SorularDto dto) {
        Sorular entity = sorularRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sorular not found"));
        sorularMapper.updateEntityFromDto(dto, entity);
        Sorular updated = sorularRepository.save(entity);
        return sorularMapper.toDto(updated);
    }

    public void delete(Integer id) {
        sorularRepository.deleteById(id);
    }
}
