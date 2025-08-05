package com.example.demo.service;

import com.example.demo.dto.DegSeviyeAgirlikDto;
import com.example.demo.entity.DegSeviyeAgirlik;
import com.example.demo.repository.DegSeviyeAgirlikRepository;
import com.example.demo.mapper.DegSeviyeAgirlikMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DegSeviyeAgirlikService {

    @Autowired
    private DegSeviyeAgirlikRepository repository;

    @Autowired
    private DegSeviyeAgirlikMapper mapper;

    // Tüm verileri getir
    public List<DegSeviyeAgirlikDto> findAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    // ID'ye göre veri getir
    public Optional<DegSeviyeAgirlikDto> findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto);
    }

    // Yeni veri oluştur
    public DegSeviyeAgirlikDto save(DegSeviyeAgirlikDto dto) {
        DegSeviyeAgirlik entity = mapper.toEntity(dto);
        DegSeviyeAgirlik savedEntity = repository.save(entity);
        return mapper.toDto(savedEntity);
    }

    // Veriyi güncelle
    public DegSeviyeAgirlikDto update(Integer id, DegSeviyeAgirlikDto dto) {
        Optional<DegSeviyeAgirlik> existingEntity = repository.findById(id);
        if (existingEntity.isPresent()) {
            DegSeviyeAgirlik entity = existingEntity.get();
            mapper.updateEntityFromDto(dto, entity);
            entity.setDegSeviyeNo(id);
            DegSeviyeAgirlik savedEntity = repository.save(entity);
            return mapper.toDto(savedEntity);
        } else {
            return null;
        }
    }

    // Veriyi sil
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
