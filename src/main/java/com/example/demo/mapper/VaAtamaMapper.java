package com.example.demo.mapper;

import com.example.demo.entity.VaAtama;
import com.example.demo.dto.VaAtamaDTO;
import com.example.demo.entity.Donem;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface VaAtamaMapper {

    VaAtamaMapper INSTANCE = Mappers.getMapper(VaAtamaMapper.class);

    // Entity -> DTO
    @Mapping(target = "donemNo", source = "donem.donemNo")
    VaAtamaDTO toDto(VaAtama entity);

    // DTO -> Entity
    @Mapping(target = "donem", source = "donemNo", qualifiedByName = "toDonem")
    VaAtama toEntity(VaAtamaDTO dto);

    // DTO -> Entity (update)
    @Mapping(target = "donem", source = "donemNo", qualifiedByName = "toDonem")
    void updateEntityFromDto(VaAtamaDTO dto, @MappingTarget VaAtama entity);

    // donemNo -> Donem dönüşümü için yardımcı method
    @Named("toDonem")
    public static Donem toDonem(Integer donemNo) {
        if (donemNo == null) {
            return null;
        }
        Donem donem = new Donem();
        donem.setDonemNo(donemNo);
        return donem;
    }
}
