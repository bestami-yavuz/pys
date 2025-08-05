package com.example.demo.mapper;

import com.example.demo.dto.HarfSkalaDto;
import com.example.demo.entity.HarfSkala;
import com.example.demo.entity.HarfSkalaTanim;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Mapper(componentModel = "spring")
public interface HarfSkalaMapper {

    HarfSkalaMapper INSTANCE = Mappers.getMapper(HarfSkalaMapper.class);

    // Entity → DTO
    @Mapping(target = "harfSkalaTanimNo", source = "harfSkalaTanim.harfSkalaTanimNo")
    @Mapping(target = "harfSkalaTanimAdi", source = "harfSkalaTanim.harfSkalaAdi")
    @Mapping(target = "operSaat", source = "operSaat", qualifiedByName = "stringToLocalDateTime")
    HarfSkalaDto toDto(HarfSkala entity);

    // DTO → Entity (sadece harfSkalaTanimNo’dan entity oluşturuyoruz)
    @Mapping(target = "harfSkalaTanim", source = "harfSkalaTanimNo", qualifiedByName = "toHarfSkalaTanim")
    @Mapping(target = "operSaat", source = "operSaat", qualifiedByName = "localDateTimeToString")
    HarfSkala toEntity(HarfSkalaDto dto);

    // DTO’dan entity güncelleme
    @Mapping(target = "harfSkalaTanim", source = "harfSkalaTanimNo", qualifiedByName = "toHarfSkalaTanim")
    @Mapping(target = "operSaat", source = "operSaat", qualifiedByName = "localDateTimeToString")
    void updateEntityFromDto(HarfSkalaDto dto, @MappingTarget HarfSkala entity);

    // String → LocalDateTime dönüşümü
    @Named("stringToLocalDateTime")
    static LocalDateTime stringToLocalDateTime(String dateStr) {
        if (dateStr == null || dateStr.isEmpty()) return null;
        return LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // LocalDateTime → String dönüşümü
    @Named("localDateTimeToString")
    static String localDateTimeToString(LocalDateTime dateTime) {
        if (dateTime == null) return null;
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // Integer → HarfSkalaTanim entity (yalnızca id set edilir)
    @Named("toHarfSkalaTanim")
    static HarfSkalaTanim toHarfSkalaTanim(Integer id) {
        if (id == null) return null;
        HarfSkalaTanim tanim = new HarfSkalaTanim();
        tanim.setHarfSkalaTanimNo(id);
        return tanim;
    }
}
