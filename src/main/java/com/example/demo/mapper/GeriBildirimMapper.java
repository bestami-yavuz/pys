package com.example.demo.mapper;

import com.example.demo.entity.GeriBildirim;
import com.example.demo.dto.GeriBildirimDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GeriBildirimMapper {
    GeriBildirimMapper INSTANCE = Mappers.getMapper(GeriBildirimMapper.class);

    @org.mapstruct.Mapping(target = "gbAlanPersDonemId", source = "gbAlanPersDonem.persDonemId")
    @org.mapstruct.Mapping(target = "gbVerenPersDonemId", source = "gbVerenPersDonem.persDonemId")
    GeriBildirimDTO toDto(GeriBildirim entity);

    @org.mapstruct.Mapping(target = "gbAlanPersDonem", source = "gbAlanPersDonemId", qualifiedByName = "toPersonelDonem")
    @org.mapstruct.Mapping(target = "gbVerenPersDonem", source = "gbVerenPersDonemId", qualifiedByName = "toPersonelDonem")
    GeriBildirim toEntity(GeriBildirimDTO dto);

    @org.mapstruct.Mapping(target = "gbAlanPersDonem", source = "gbAlanPersDonemId", qualifiedByName = "toPersonelDonem")
    @org.mapstruct.Mapping(target = "gbVerenPersDonem", source = "gbVerenPersDonemId", qualifiedByName = "toPersonelDonem")
    void updateEntityFromDto(GeriBildirimDTO dto, @MappingTarget GeriBildirim entity);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.demo.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.demo.entity.PersonelDonem pd = new com.example.demo.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
