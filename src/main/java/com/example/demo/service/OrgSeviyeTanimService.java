package com.example.demo.service;

import com.example.demo.dto.OrgSeviyeTanimDTO;
import com.example.demo.entity.OrgSeviyeTanim;
import com.example.demo.mapper.OrgSeviyeTanimMapper;
import com.example.demo.repository.OrgSeviyeTanimRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrgSeviyeTanimService {

    private final OrgSeviyeTanimRepository repository;
    private final OrgSeviyeTanimMapper mapper;

    public OrgSeviyeTanimService(OrgSeviyeTanimRepository repository, OrgSeviyeTanimMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<OrgSeviyeTanimDTO> findAll() {
        List<OrgSeviyeTanim> entities = repository.findAll();
        // toDto metodunu listeye uygulamak için stream kullanıyoruz
        return entities.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public OrgSeviyeTanimDTO findById(Integer id) {
        Optional<OrgSeviyeTanim> entityOpt = repository.findById(id);
        return entityOpt.map(mapper::toDto).orElse(null);
    }

    public OrgSeviyeTanimDTO save(OrgSeviyeTanimDTO dto) {
        OrgSeviyeTanim entity = mapper.toEntity(dto);
        OrgSeviyeTanim savedEntity = repository.save(entity);
        return mapper.toDto(savedEntity);
    }

    public boolean deleteById(Integer id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
