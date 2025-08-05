package com.example.demo.mapper;

import com.example.demo.entity.Degerlendirme;
import com.example.demo.dto.DegerlendirmeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DegerlendirmeMapper {
    DegerlendirmeMapper INSTANCE = Mappers.getMapper(DegerlendirmeMapper.class);

    @org.mapstruct.Mapping(target = "degAlanPersDonemId", source = "degAlanPersDonem.persDonemId")
    @org.mapstruct.Mapping(target = "degVerenPersDonemId", source = "degVerenPersDonem.persDonemId")
    DegerlendirmeDTO toDto(Degerlendirme entity);

    @org.mapstruct.Mapping(target = "degAlanPersDonem", source = "degAlanPersDonemId", qualifiedByName = "toPersonelDonem")
    @org.mapstruct.Mapping(target = "degVerenPersDonem", source = "degVerenPersDonemId", qualifiedByName = "toPersonelDonem")
    Degerlendirme toEntity(DegerlendirmeDTO dto);

    @org.mapstruct.Mapping(target = "degAlanPersDonem", source = "degAlanPersDonemId", qualifiedByName = "toPersonelDonem")
    @org.mapstruct.Mapping(target = "degVerenPersDonem", source = "degVerenPersDonemId", qualifiedByName = "toPersonelDonem")
    void updateEntityFromDto(DegerlendirmeDTO dto, @MappingTarget Degerlendirme entity);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.demo.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.demo.entity.PersonelDonem pd = new com.example.demo.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
