package com.example.demo.service;

import com.example.demo.entity.SorularAktarim;
import com.example.demo.repository.SorularAktarimRepository;
import com.example.demo.dto.SorularAktarimDTO;
import com.example.demo.mapper.SorularAktarimMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SorularAktarimService {

    @Autowired
    private SorularAktarimRepository sorularAktarimRepository;

    @Autowired
    private SorularAktarimMapper sorularAktarimMapper;

    public List<SorularAktarimDTO> findAll() {
        List<SorularAktarim> entities = sorularAktarimRepository.findAll();
        return entities.stream()
                .map(sorularAktarimMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<SorularAktarimDTO> findById(Integer id) {
        return sorularAktarimRepository.findById(id)
                .map(sorularAktarimMapper::toDto);
    }

    public SorularAktarimDTO save(SorularAktarimDTO dto) {
        SorularAktarim entity = sorularAktarimMapper.toEntity(dto);
        SorularAktarim saved = sorularAktarimRepository.save(entity);
        return sorularAktarimMapper.toDto(saved);
    }

    public SorularAktarimDTO update(Integer id, SorularAktarimDTO dto) {
        SorularAktarim entity = sorularAktarimRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("SorularAktarim not found"));
        entity.setSiraNo(id); // PK alanı güncelleniyorsa burada setleniyor
        sorularAktarimMapper.updateEntityFromDto(dto, entity);
        SorularAktarim updated = sorularAktarimRepository.save(entity);
        return sorularAktarimMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        sorularAktarimRepository.deleteById(id);
    }
}
