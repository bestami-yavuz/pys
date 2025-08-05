package com.example.demo.mapper;

import com.example.demo.entity.SorularAktarim;
import com.example.demo.dto.SorularAktarimDTO;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SorularAktarimMapper {

    SorularAktarimMapper INSTANCE = Mappers.getMapper(SorularAktarimMapper.class);

    // Entity -> DTO
    SorularAktarimDTO toDto(SorularAktarim entity);

    // DTO -> Entity
    SorularAktarim toEntity(SorularAktarimDTO dto);

    // DTO -> Entity update
    void updateEntityFromDto(SorularAktarimDTO dto, @MappingTarget SorularAktarim entity);
}
