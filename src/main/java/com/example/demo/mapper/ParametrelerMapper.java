package com.example.demo.mapper;

import com.example.demo.dto.ParametrelerDTO;
import com.example.demo.entity.Parametreler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ParametrelerMapper {

    ParametrelerMapper INSTANCE = Mappers.getMapper(ParametrelerMapper.class);

    @Named("entityToDto")
    @Mapping(source = "parametreadi", target = "parametreAdi")
    @Mapping(source = "parametredegeri", target = "parametreDegeri")
    @Mapping(source = "parametretipi", target = "parametreTipi")
    @Mapping(source = "parametredegeri4000", target = "parametreDegeri4000")
    ParametrelerDTO toDto(Parametreler entity);

    @Named("dtoToEntity")
    @Mapping(source = "parametreAdi", target = "parametreadi")
    @Mapping(source = "parametreDegeri", target = "parametredegeri")
    @Mapping(source = "parametreTipi", target = "parametretipi")
    @Mapping(source = "parametreDegeri4000", target = "parametredegeri4000")
    Parametreler toEntity(ParametrelerDTO dto);

    @Named("updateEntityFromDto")
    @Mapping(source = "parametreAdi", target = "parametreadi")
    @Mapping(source = "parametreDegeri", target = "parametredegeri")
    @Mapping(source = "parametreTipi", target = "parametretipi")
    @Mapping(source = "parametreDegeri4000", target = "parametredegeri4000")
    void updateEntityFromDto(ParametrelerDTO dto, @MappingTarget Parametreler entity);
}
