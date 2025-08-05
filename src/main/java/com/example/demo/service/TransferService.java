package com.example.demo.service;

import com.example.demo.entity.Transfer;
import com.example.demo.dto.TransferDTO;
import com.example.demo.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TransferMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TransferService {
    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private TransferMapper transferMapper;

    public List<TransferDTO> findAll() {
        List<Transfer> entities = transferRepository.findAll();
        return entities.stream()
                .map(transferMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<TransferDTO> findById(Integer id) {
        return transferRepository.findById(id)
                .map(transferMapper::toDto);
    }

    public TransferDTO save(TransferDTO dto) {
        Transfer entity = transferMapper.toEntity(dto);
        Transfer saved = transferRepository.save(entity);
        return transferMapper.toDto(saved);
    }

    public TransferDTO update(Integer id, TransferDTO dto) {
        Transfer entity = transferRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Transfer not found"));
        entity.setTransferId(id);
        transferMapper.updateEntityFromDto(dto, entity);
        Transfer updated = transferRepository.save(entity);
        return transferMapper.toDto(updated);
    }

    public void deleteById(Integer id) {
        transferRepository.deleteById(id);
    }
}
