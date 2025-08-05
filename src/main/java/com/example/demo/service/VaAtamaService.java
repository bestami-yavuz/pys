package com.example.demo.service;

import com.example.demo.entity.VaAtama;
import com.example.demo.repository.VaAtamaRepository;
import com.example.demo.dto.VaAtamaDTO;
import com.example.demo.mapper.VaAtamaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VaAtamaService {

    @Autowired
    private VaAtamaRepository vaAtamaRepository;

    @Autowired
    private VaAtamaMapper vaAtamaMapper;

    public List<VaAtamaDTO> findAll() {
        List<VaAtama> entities = vaAtamaRepository.findAll();
        return entities.stream()
                .map(vaAtamaMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<VaAtamaDTO> findById(Integer id) {
        return vaAtamaRepository.findById(id)
                .map(vaAtamaMapper::toDto);
    }

    public VaAtamaDTO save(VaAtamaDTO dto) {
        VaAtama entity = vaAtamaMapper.toEntity(dto);
        VaAtama saved = vaAtamaRepository.save(entity);
        return vaAtamaMapper.toDto(saved);
    }

    public VaAtamaDTO update(Integer id, VaAtamaDTO dto) {
        VaAtama entity = vaAtamaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("VaAtama not found"));
        entity.setVaAtamaId(id);
        vaAtamaMapper.updateEntityFromDto(dto, entity);
        VaAtama updated = vaAtamaRepository.save(entity);
        return vaAtamaMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        vaAtamaRepository.deleteById(id);
    }
}
