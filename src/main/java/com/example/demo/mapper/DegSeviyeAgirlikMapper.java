package com.example.demo.mapper;

import com.example.demo.dto.DegSeviyeAgirlikDto;
import com.example.demo.entity.DegSeviyeAgirlik;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;

@Mapper(componentModel = "spring")
public interface DegSeviyeAgirlikMapper {

    DegSeviyeAgirlikMapper INSTANCE = Mappers.getMapper(DegSeviyeAgirlikMapper.class);

    // Entity -> DTO dönüşümü
    @Mapping(target = "seviyeId", source = "seviyeId")
    @Mapping(target = "degerlendiriciSeviyeId", source = "degerlendiriciSeviyeId")
    @Mapping(target = "agirlikAmir", source = "agirlikAmir", qualifiedByName = "bigDecimalToDouble")
    @Mapping(target = "agirlikAmirDegil", source = "agirlikAmirDegil", qualifiedByName = "bigDecimalToDouble")
    DegSeviyeAgirlikDto toDto(DegSeviyeAgirlik entity);

    // DTO -> Entity dönüşümü
    @Mapping(target = "seviyeId", source = "seviyeId")
    @Mapping(target = "degerlendiriciSeviyeId", source = "degerlendiriciSeviyeId")
    @Mapping(target = "agirlikAmir", expression = "java(dto.getAgirlikAmir() == null ? null : java.math.BigDecimal.valueOf(dto.getAgirlikAmir()))")
    @Mapping(target = "agirlikAmirDegil", expression = "java(dto.getAgirlikAmirDegil() == null ? null : java.math.BigDecimal.valueOf(dto.getAgirlikAmirDegil()))")
    DegSeviyeAgirlik toEntity(DegSeviyeAgirlikDto dto);

    // DTO'dan var olan entity'ye update
    @Mapping(target = "seviyeId", source = "seviyeId")
    @Mapping(target = "degerlendiriciSeviyeId", source = "degerlendiriciSeviyeId")
    @Mapping(target = "agirlikAmir", expression = "java(dto.getAgirlikAmir() == null ? null : java.math.BigDecimal.valueOf(dto.getAgirlikAmir()))")
    @Mapping(target = "agirlikAmirDegil", expression = "java(dto.getAgirlikAmirDegil() == null ? null : java.math.BigDecimal.valueOf(dto.getAgirlikAmirDegil()))")
    void updateEntityFromDto(DegSeviyeAgirlikDto dto, @MappingTarget DegSeviyeAgirlik entity);

    @Named("bigDecimalToDouble")
    static Double bigDecimalToDouble(BigDecimal value) {
        return value == null ? null : value.doubleValue();
    }
}
