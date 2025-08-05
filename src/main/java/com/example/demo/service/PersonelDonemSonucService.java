package com.example.demo.service;

import com.example.demo.entity.PersonelDonemSonuc;
import com.example.demo.dto.PersonelDonemSonucDTO;
import com.example.demo.repository.PersonelDonemSonucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PersonelDonemSonucMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonelDonemSonucService {
    @Autowired
    private PersonelDonemSonucRepository personelDonemSonucRepository;

    @Autowired
    private PersonelDonemSonucMapper personelDonemSonucMapper;

    public List<PersonelDonemSonucDTO> findAll() {
        List<PersonelDonemSonuc> entities = personelDonemSonucRepository.findAll();
        return entities.stream()
                .map(personelDonemSonucMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<PersonelDonemSonucDTO> findById(Integer id) {
        return personelDonemSonucRepository.findById(id)
                .map(personelDonemSonucMapper::toDto);
    }

    public PersonelDonemSonucDTO save(PersonelDonemSonucDTO dto) {
        PersonelDonemSonuc entity = personelDonemSonucMapper.toEntity(dto);
        PersonelDonemSonuc saved = personelDonemSonucRepository.save(entity);
        return personelDonemSonucMapper.toDto(saved);
    }

    public PersonelDonemSonucDTO update(Integer id, PersonelDonemSonucDTO dto) {
        PersonelDonemSonuc entity = personelDonemSonucRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("PersonelDonemSonuc not found"));
        entity.setSonucId(id);
        personelDonemSonucMapper.updateEntityFromDto(dto, entity);
        PersonelDonemSonuc updated = personelDonemSonucRepository.save(entity);
        return personelDonemSonucMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        personelDonemSonucRepository.deleteById(id);
    }
}
