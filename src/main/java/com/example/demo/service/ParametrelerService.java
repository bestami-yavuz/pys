package com.example.demo.service;

import com.example.demo.dto.ParametrelerDTO;
import com.example.demo.entity.Parametreler;
import com.example.demo.mapper.ParametrelerMapper;
import com.example.demo.repository.ParametrelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ParametrelerService {

    @Autowired
    private ParametrelerRepository parametrelerRepository;

    @Autowired
    private ParametrelerMapper parametrelerMapper;

    public List<ParametrelerDTO> findAll() {
        List<Parametreler> entities = parametrelerRepository.findAll();
        return entities.stream()
                .map(parametrelerMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<ParametrelerDTO> findById(Integer id) {
        return parametrelerRepository.findById(id)
                .map(parametrelerMapper::toDto);
    }

    public ParametrelerDTO save(ParametrelerDTO dto) {
        Parametreler entity = parametrelerMapper.toEntity(dto);
        Parametreler saved = parametrelerRepository.save(entity);
        return parametrelerMapper.toDto(saved);
    }

    public ParametrelerDTO update(Integer id, ParametrelerDTO dto) {
        Parametreler entity = parametrelerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parametreler not found"));
        parametrelerMapper.updateEntityFromDto(dto, entity);
        Parametreler updated = parametrelerRepository.save(entity);
        return parametrelerMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        parametrelerRepository.deleteById(id);
    }
}
