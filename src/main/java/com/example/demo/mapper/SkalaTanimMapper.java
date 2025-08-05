package com.example.demo.mapper;

import com.example.demo.dto.SkalaTanimDto;
import com.example.demo.entity.SkalaTanim;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface SkalaTanimMapper {

    SkalaTanimDto toDto(SkalaTanim entity);

    SkalaTanim toEntity(SkalaTanimDto dto);

    void updateEntityFromDto(SkalaTanimDto dto, @MappingTarget SkalaTanim entity);
}
