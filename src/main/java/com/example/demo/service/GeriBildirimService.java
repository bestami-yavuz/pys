package com.example.demo.service;

import com.example.demo.entity.GeriBildirim;
import com.example.demo.dto.GeriBildirimDTO;
import com.example.demo.repository.GeriBildirimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.GeriBildirimMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GeriBildirimService {
    @Autowired
    private GeriBildirimRepository geriBildirimRepository;

    @Autowired
    private GeriBildirimMapper geriBildirimMapper;

    public List<GeriBildirimDTO> findAll() {
        List<GeriBildirim> entities = geriBildirimRepository.findAll();
        return entities.stream()
                .map(geriBildirimMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<GeriBildirimDTO> findById(Integer id) {
        return geriBildirimRepository.findById(id)
                .map(geriBildirimMapper::toDto);
    }

    public GeriBildirimDTO save(GeriBildirimDTO dto) {
        GeriBildirim entity = geriBildirimMapper.toEntity(dto);
        GeriBildirim saved = geriBildirimRepository.save(entity);
        return geriBildirimMapper.toDto(saved);
    }

    public GeriBildirimDTO update(Integer id, GeriBildirimDTO dto) {
        GeriBildirim entity = geriBildirimRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("GeriBildirim not found"));
        entity.setGbId(id);
        geriBildirimMapper.updateEntityFromDto(dto, entity);
        GeriBildirim updated = geriBildirimRepository.save(entity);
        return geriBildirimMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        geriBildirimRepository.deleteById(id);
    }
}
