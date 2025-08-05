package com.example.demo.service;

import com.example.demo.dto.HarfSkalaTanimDto;
import com.example.demo.entity.HarfSkalaTanim;
import com.example.demo.mapper.HarfSkalaTanimMapper;
import com.example.demo.repository.HarfSkalaTanimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class HarfSkalaTanimService {



    @Autowired
    private HarfSkalaTanimRepository repository;

    @Autowired
    private HarfSkalaTanimMapper mapper;

    // Tüm kayıtları listele
    public List<HarfSkalaTanimDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    // ID ile getir
    public HarfSkalaTanimDto getById(Integer id) {
        Optional<HarfSkalaTanim> entityOpt = repository.findById(id);
        return entityOpt.map(mapper::toDto).orElse(null);
    }

    // Yeni kayıt oluştur
    public HarfSkalaTanimDto create(HarfSkalaTanimDto dto) {
        HarfSkalaTanim entity = mapper.toEntity(dto);
        HarfSkalaTanim saved = repository.save(entity);
        return mapper.toDto(saved);
    }

    // Güncelleme
    public HarfSkalaTanimDto update(Integer id, HarfSkalaTanimDto dto) {
        Optional<HarfSkalaTanim> optionalEntity = repository.findById(id);
        if (optionalEntity.isPresent()) {
            HarfSkalaTanim entity = optionalEntity.get();
            mapper.updateEntityFromDto(dto, entity);
            HarfSkalaTanim updated = repository.save(entity);
            return mapper.toDto(updated);
        }
        return null;
    }

    // Silme
    public boolean delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
