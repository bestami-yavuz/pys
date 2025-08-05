package com.example.demo.service;

import com.example.demo.dto.DonemDTO;
import com.example.demo.entity.Donem;
import com.example.demo.mapper.DonemMapper;
import com.example.demo.repository.DonemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DonemService {

    @Autowired
    private DonemRepository donemRepository;

    @Autowired
    private DonemMapper donemMapper;

    public List<DonemDTO> getAll() {
        List<Donem> donemList = donemRepository.findAll();
        return donemList.stream()
                .map(donemMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<DonemDTO> getById(Integer id) {
        return donemRepository.findById(id)
                .map(donemMapper::toDto);
    }

    public DonemDTO save(DonemDTO dto) {
        Donem entity = donemMapper.toEntity(dto);
        Donem saved = donemRepository.save(entity);
        return donemMapper.toDto(saved);
    }

    public DonemDTO update(Integer id, DonemDTO dto) {
        Donem entity = donemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Donem not found with id: " + id));
        donemMapper.updateEntityFromDto(dto, entity);
        Donem updated = donemRepository.save(entity);
        return donemMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        if (!donemRepository.existsById(id)) {
            throw new RuntimeException("Donem not found with id: " + id);
        }
        donemRepository.deleteById(id);
    }
}
