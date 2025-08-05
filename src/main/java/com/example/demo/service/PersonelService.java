package com.example.demo.service;

import com.example.demo.entity.Personel;
import com.example.demo.dto.PersonelDTO;
import com.example.demo.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PersonelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonelService {
    @Autowired
    private PersonelRepository personelRepository;

    @Autowired
    private PersonelMapper personelMapper;

    public List<PersonelDTO> findAll() {
        List<Personel> entities = personelRepository.findAll();
        return entities.stream()
                .map(personelMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<PersonelDTO> findById(Integer id) {
        return personelRepository.findById(id)
                .map(personelMapper::toDto);
    }

    public PersonelDTO save(PersonelDTO dto) {
        Personel entity = personelMapper.toEntity(dto);
        // Yeni kayıt eklerken ID null olmalı
        entity.setPersId(null);
        Personel saved = personelRepository.save(entity);
        return personelMapper.toDto(saved);
    }

    public void deleteById(Integer id) {
        personelRepository.deleteById(id);
    }

    public PersonelDTO update(Integer id, PersonelDTO dto) {
        Personel entity = personelRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Personel not found"));
        entity.setPersId(id);
        personelMapper.updateEntityFromDto(dto, entity);
        Personel updated = personelRepository.save(entity);
        return personelMapper.toDto(updated);
    }
}
