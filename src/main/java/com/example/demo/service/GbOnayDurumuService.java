package com.example.demo.service;

import com.example.demo.entity.GbOnayDurumu;
import com.example.demo.dto.GbOnayDurumuDTO;
import com.example.demo.repository.GbOnayDurumuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.GbOnayDurumuMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GbOnayDurumuService {
    @Autowired
    private GbOnayDurumuRepository gbOnayDurumuRepository;

    @Autowired
    private GbOnayDurumuMapper gbOnayDurumuMapper;

    public List<GbOnayDurumuDTO> findAll() {
        List<GbOnayDurumu> entities = gbOnayDurumuRepository.findAll();
        return entities.stream()
                .map(gbOnayDurumuMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<GbOnayDurumuDTO> findById(Integer id) {
        return gbOnayDurumuRepository.findById(id)
                .map(gbOnayDurumuMapper::toDto);
    }

    public GbOnayDurumuDTO save(GbOnayDurumuDTO dto) {
        GbOnayDurumu entity = gbOnayDurumuMapper.toEntity(dto);
        GbOnayDurumu saved = gbOnayDurumuRepository.save(entity);
        return gbOnayDurumuMapper.toDto(saved);
    }

    public GbOnayDurumuDTO update(Integer id, GbOnayDurumuDTO dto) {
        GbOnayDurumu entity = gbOnayDurumuRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("GbOnayDurumu not found"));
        entity.setKayitId(id);
        gbOnayDurumuMapper.updateEntityFromDto(dto, entity);
        GbOnayDurumu updated = gbOnayDurumuRepository.save(entity);
        return gbOnayDurumuMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        gbOnayDurumuRepository.deleteById(id);
    }
}
