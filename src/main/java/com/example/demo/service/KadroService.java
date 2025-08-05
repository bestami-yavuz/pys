package com.example.demo.service;

import com.example.demo.dto.KadroDTO;
import com.example.demo.entity.Donem;
import com.example.demo.entity.Kadro;
import com.example.demo.mapper.KadroMapper;
import com.example.demo.repository.DonemRepository;
import com.example.demo.repository.KadroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KadroService {

    private final KadroRepository kadroRepository;
    private final KadroMapper kadroMapper;
    private final DonemRepository donemRepository;

    public KadroService(KadroRepository kadroRepository, KadroMapper kadroMapper, DonemRepository donemRepository) {
        this.kadroRepository = kadroRepository;
        this.kadroMapper = kadroMapper;
        this.donemRepository = donemRepository;
    }

    // Tüm kayıtları getir
    public List<KadroDTO> findAll() {
        List<Kadro> kadroList = kadroRepository.findAll();
        return kadroList.stream()
                .map(kadroMapper::toDto)
                .collect(Collectors.toList());
    }

    // ID ile kayıt bul
    public KadroDTO findById(Integer id) {
        Kadro kadro = kadroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kadro bulunamadı: " + id));
        return kadroMapper.toDto(kadro);
    }

    // Yeni kayıt oluştur
    public KadroDTO save(KadroDTO dto) {
        Kadro kadro = kadroMapper.toEntity(dto);

        // Donem entity'sini alıp set et
        Donem donem = donemRepository.findById(dto.getDonemNo())
                .orElseThrow(() -> new RuntimeException("Donem bulunamadı: " + dto.getDonemNo()));
        kadro.setDonem(donem);

        Kadro saved = kadroRepository.save(kadro);
        return kadroMapper.toDto(saved);
    }

    // Kayıt güncelle
    public KadroDTO update(Integer id, KadroDTO dto) {
        Kadro existing = kadroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kadro bulunamadı: " + id));

        // Donem entity'sini alıp set et
        Donem donem = donemRepository.findById(dto.getDonemNo())
                .orElseThrow(() -> new RuntimeException("Donem bulunamadı: " + dto.getDonemNo()));
        existing.setDonem(donem);

        existing.setPozKod(dto.getPozKod());
        existing.setPozAd(dto.getPozAd());
        existing.setOrgKod(dto.getOrgKod());
        existing.setUniteKod(dto.getUniteKod());
        existing.setOper(dto.getOper());
        existing.setOperSaat(dto.getOperSaat());

        Kadro updated = kadroRepository.save(existing);
        return kadroMapper.toDto(updated);
    }

    // Kayıt sil
    public void delete(Integer id) {
        kadroRepository.deleteById(id);
    }
}
