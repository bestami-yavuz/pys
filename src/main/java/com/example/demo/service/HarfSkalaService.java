package com.example.demo.service;

import com.example.demo.dto.HarfSkalaDto;
import com.example.demo.entity.HarfSkala;
import com.example.demo.mapper.HarfSkalaMapper;
import com.example.demo.repository.HarfSkalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HarfSkalaService {

    private final HarfSkalaRepository harfSkalaRepository;
    private final HarfSkalaMapper harfSkalaMapper;

    public HarfSkalaService(HarfSkalaRepository harfSkalaRepository, HarfSkalaMapper harfSkalaMapper) {
        this.harfSkalaRepository = harfSkalaRepository;
        this.harfSkalaMapper = harfSkalaMapper;
    }

    public List<HarfSkalaDto> getAll() {
        List<HarfSkala> entities = harfSkalaRepository.findAll();
        return entities.stream()
                .map(harfSkalaMapper::toDto)
                .collect(Collectors.toList());
    }

    public HarfSkalaDto getById(Integer id) {
        Optional<HarfSkala> optional = harfSkalaRepository.findById(id);
        return optional.map(harfSkalaMapper::toDto).orElse(null);
    }

    public HarfSkalaDto create(HarfSkalaDto dto) {
        HarfSkala entity = harfSkalaMapper.toEntity(dto);
        HarfSkala saved = harfSkalaRepository.save(entity);
        return harfSkalaMapper.toDto(saved);
    }

    public HarfSkalaDto update(Integer id, HarfSkalaDto dto) {
        Optional<HarfSkala> optional = harfSkalaRepository.findById(id);
        if (optional.isPresent()) {
            HarfSkala existing = optional.get();
            harfSkalaMapper.updateEntityFromDto(dto, existing);
            HarfSkala updated = harfSkalaRepository.save(existing);
            return harfSkalaMapper.toDto(updated);
        }
        return null;
    }

    public boolean delete(Integer id) {
        if (harfSkalaRepository.existsById(id)) {
            harfSkalaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
