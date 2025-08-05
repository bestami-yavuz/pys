package com.example.demo.mapper;

import com.example.demo.dto.DoLogDTO;
import com.example.demo.entity.DoLog;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DoLogMapper {

    DoLogMapper INSTANCE = Mappers.getMapper(DoLogMapper.class);

    // Entity to DTO dönüşümü
    DoLogDTO toDto(DoLog entity);

    // DTO to Entity dönüşümü
    DoLog toEntity(DoLogDTO dto);

    // DTO'dan var olan entity'ye update
    void updateEntityFromDto(DoLogDTO dto, @MappingTarget DoLog entity);

    // Örnek: eğer özel bir dönüşüm gerekiyorsa @Named metot yazabilirsin
    // Şimdilik alanların birebir eşleştiği için ekstra dönüşüm yok, ama örnek:
    @Named("logTarihStringToDate")
    default String convertLogTarih(String logTarih) {
        // Örnek dönüşüm fonksiyonu, sen ihtiyaca göre Date tipine çevirme vs yapabilirsin
        return logTarih;
    }
}
