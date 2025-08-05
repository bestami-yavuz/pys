package com.example.demo.service;

import com.example.demo.dto.DegerlendirmeDTO;
import com.example.demo.entity.Degerlendirme;
import com.example.demo.repository.DegerlendirmeRepository;
import com.example.demo.mapper.DegerlendirmeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DegerlendirmeService {
    @Autowired
    private DegerlendirmeRepository degerlendirmeRepository;

    @Autowired
    private DegerlendirmeMapper degerlendirmeMapper;

    public List<DegerlendirmeDTO> findAll() {
        return degerlendirmeRepository.findAll().stream()
                .map(degerlendirmeMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<DegerlendirmeDTO> findById(Integer id) {
        return degerlendirmeRepository.findById(id)
                .map(degerlendirmeMapper::toDto);
    }

    public DegerlendirmeDTO save(DegerlendirmeDTO dto) {
        Degerlendirme entity = degerlendirmeMapper.toEntity(dto);
        Degerlendirme savedEntity = degerlendirmeRepository.save(entity);
        return degerlendirmeMapper.toDto(savedEntity);
    }

    public DegerlendirmeDTO update(Integer id, DegerlendirmeDTO dto) {
        Optional<Degerlendirme> existingEntity = degerlendirmeRepository.findById(id);
        if (existingEntity.isPresent()) {
            Degerlendirme entity = existingEntity.get();
            degerlendirmeMapper.updateEntityFromDto(dto, entity);
            entity.setDegNo(id);
            Degerlendirme savedEntity = degerlendirmeRepository.save(entity);
            return degerlendirmeMapper.toDto(savedEntity);
        } else {
            return null;
        }
    }

    public void deleteById(Integer id) {
        degerlendirmeRepository.deleteById(id);
    }
}
