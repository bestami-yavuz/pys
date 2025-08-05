package com.example.demo.service;

import com.example.demo.entity.Org;
import com.example.demo.repository.OrgRepository;
import com.example.demo.dto.OrgDTO;
import com.example.demo.mapper.OrgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrgService {

    @Autowired
    private OrgRepository orgRepository;

    @Autowired
    private OrgMapper orgMapper;

    public List<OrgDTO> findAll() {
        List<Org> entities = orgRepository.findAll();
        return entities.stream()
                .map(orgMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<OrgDTO> findById(Integer id) {
        return orgRepository.findById(id)
                .map(orgMapper::toDto);
    }

    public OrgDTO save(OrgDTO dto) {
        Org entity = orgMapper.toEntity(dto);
        Org saved = orgRepository.save(entity);
        return orgMapper.toDto(saved);
    }

    public OrgDTO update(Integer id, OrgDTO dto) {
        Org entity = orgRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Org not found"));
        entity.setOrgId(id);
        orgMapper.updateEntityFromDto(dto, entity);
        Org updated = orgRepository.save(entity);
        return orgMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        orgRepository.deleteById(id);
    }
}
