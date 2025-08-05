package com.example.demo.service;

import com.example.demo.entity.PersonelDonem;
import com.example.demo.dto.PersonelDonemDTO;
import com.example.demo.repository.PersonelDonemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PersonelDonemMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonelDonemService {
    @Autowired
    private PersonelDonemRepository personelDonemRepository;

    @Autowired
    private PersonelDonemMapper personelDonemMapper;

    public List<PersonelDonemDTO> findAll() {
        List<PersonelDonem> entities = personelDonemRepository.findAll();
        return entities.stream()
                .map(personelDonemMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<PersonelDonemDTO> findById(Integer id) {
        return personelDonemRepository.findById(id)
                .map(personelDonemMapper::toDto);
    }

    public PersonelDonemDTO save(PersonelDonemDTO dto) {
        PersonelDonem entity = personelDonemMapper.toEntity(dto);
        PersonelDonem saved = personelDonemRepository.save(entity);
        return personelDonemMapper.toDto(saved);
    }

    public PersonelDonemDTO update(Integer id, PersonelDonemDTO dto) {
        PersonelDonem entity = personelDonemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("PersonelDonem not found"));
        entity.setPersDonemId(id);
        personelDonemMapper.updateEntityFromDto(dto, entity);
        PersonelDonem updated = personelDonemRepository.save(entity);
        return personelDonemMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        personelDonemRepository.deleteById(id);
    }
}
