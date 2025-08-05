package com.example.demo.mapper;

import com.example.demo.dto.HarfSkalaTanimDto;
import com.example.demo.entity.HarfSkalaTanim;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface HarfSkalaTanimMapper {

    HarfSkalaTanimMapper INSTANCE = Mappers.getMapper(HarfSkalaTanimMapper.class);

    // Entity -> DTO dönüşümü
    @Mapping(target = "harfSkalaTanimNo", source = "harfSkalaTanimNo")
    @Mapping(target = "ad", source = "harfSkalaAdi")
    @Mapping(target = "durum", source = "skalaDurum")
    @Mapping(target = "saat", source = "operSaat")
    HarfSkalaTanimDto toDto(HarfSkalaTanim entity);

    // DTO -> Entity dönüşümü
    @Mapping(target = "harfSkalaTanimNo", source = "harfSkalaTanimNo")
    @Mapping(target = "harfSkalaAdi", source = "ad")
    @Mapping(target = "skalaDurum", source = "durum")
    @Mapping(target = "operSaat", source = "saat")
    HarfSkalaTanim toEntity(HarfSkalaTanimDto dto);

    // DTO'dan entity güncelleme
    @Mapping(target = "harfSkalaTanimNo", source = "harfSkalaTanimNo")
    @Mapping(target = "harfSkalaAdi", source = "ad")
    @Mapping(target = "skalaDurum", source = "durum")
    @Mapping(target = "operSaat", source = "saat")
    void updateEntityFromDto(HarfSkalaTanimDto dto, @MappingTarget HarfSkalaTanim entity);
}
