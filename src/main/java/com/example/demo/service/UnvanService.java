package com.example.demo.service;

import com.example.demo.entity.Unvan;
import com.example.demo.dto.UnvanDTO;
import com.example.demo.mapper.UnvanMapper;
import com.example.demo.repository.UnvanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UnvanService {

    @Autowired
    private UnvanRepository unvanRepository;

    @Autowired
    private UnvanMapper unvanMapper;

    public List<UnvanDTO> findAll() {
        List<Unvan> entities = unvanRepository.findAll();
        return entities.stream()
                .map(unvanMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<UnvanDTO> findById(Integer id) {
        return unvanRepository.findById(id)
                .map(unvanMapper::toDto);
    }

    public UnvanDTO save(UnvanDTO dto) {
        Unvan entity = unvanMapper.toEntity(dto);
        Unvan saved = unvanRepository.save(entity);
        return unvanMapper.toDto(saved);
    }

    public UnvanDTO update(Integer id, UnvanDTO dto) {
        Unvan entity = unvanRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Unvan not found"));
        entity.setUnvanId(id);
        unvanMapper.updateEntityFromDto(dto, entity);
        Unvan updated = unvanRepository.save(entity);
        return unvanMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        unvanRepository.deleteById(id);
    }
}
