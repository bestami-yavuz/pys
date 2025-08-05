package com.example.demo.service;

import com.example.demo.dto.DoLogDTO;
import com.example.demo.entity.DoLog;
import com.example.demo.mapper.DoLogMapper;
import com.example.demo.repository.DoLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoLogService {

    @Autowired
    private DoLogRepository doLogRepository;

    @Autowired
    private DoLogMapper doLogMapper;

    // Tüm DoLog kayıtlarını getir
    public List<DoLogDTO> getAll() {
        List<DoLog> entities = doLogRepository.findAll(); // Repository'den tüm verileri al
        return entities.stream() // Verileri stream'e dönüştür
            .map(doLogMapper::toDto) // Entity'yi DTO'ya dönüştür
            .collect(Collectors.toList()); // Listeyi döndür
    }

    // ID ile DoLog kaydını getir
    public DoLogDTO getById(Integer id) {
        DoLog entity = doLogRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("DoLog not found with id: " + id)); // ID ile bul
        return doLogMapper.toDto(entity); // DTO'ya dönüştür ve döndür
    }

    // Yeni bir DoLog kaydı oluştur
    public DoLogDTO save(DoLogDTO dto) {
        DoLog entity = doLogMapper.toEntity(dto); // DTO'yu Entity'ye dönüştür
        entity = doLogRepository.save(entity); // Repository'ye kaydet
        return doLogMapper.toDto(entity); // Kaydedilen entity'yi DTO'ya dönüştür ve döndür
    }

    // Var olan bir DoLog kaydını güncelle
    public DoLogDTO update(Integer id, DoLogDTO dto) {
        DoLog entity = doLogRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("DoLog not found with id: " + id)); // ID ile bul
        doLogMapper.updateEntityFromDto(dto, entity); // DTO'dan entity'yi güncelle
        entity = doLogRepository.save(entity); // Repository'ye kaydet
        return doLogMapper.toDto(entity); // DTO'ya dönüştür ve döndür
    }

    // ID ile DoLog kaydını sil
    public void delete(Integer id) {
        doLogRepository.deleteById(id); // Repository'den sil
    }
}
