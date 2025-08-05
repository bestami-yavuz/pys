package com.example.demo.mapper;

import com.example.demo.entity.Sorular;
import com.example.demo.dto.SorularDto;
import com.example.demo.entity.Kadro;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SorularMapper {

    SorularMapper INSTANCE = Mappers.getMapper(SorularMapper.class);

    // Entity -> DTO dönüşümü
    @Mapping(target = "kadroId", source = "kadro.kadroId")
    SorularDto toDto(Sorular entity);

    // DTO -> Entity dönüşümü
    @Mapping(target = "kadro", source = "kadroId", qualifiedByName = "toKadro")
    Sorular toEntity(SorularDto dto);

    // DTO -> Entity update
    @Mapping(target = "kadro", source = "kadroId", qualifiedByName = "toKadro")
    void updateEntityFromDto(SorularDto dto, @MappingTarget Sorular entity);

    // kadroId'den Kadro nesnesine dönüşüm
    @Named("toKadro")
    public static Kadro toKadro(Integer kadroId) {
        if (kadroId == null) return null;
        Kadro kadro = new Kadro();
        kadro.setKadroId(kadroId);
        return kadro;
    }
}
