package com.example.demo.mapper;

import com.example.demo.entity.PersonelDonem;
import com.example.demo.dto.PersonelDonemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonelDonemMapper {
    PersonelDonemMapper INSTANCE = Mappers.getMapper(PersonelDonemMapper.class);

    @org.mapstruct.Mapping(target = "persId", source = "personel.persId")
    PersonelDonemDTO toDto(PersonelDonem entity);

    @org.mapstruct.Mapping(target = "personel", source = "persId", qualifiedByName = "toPersonel")
    PersonelDonem toEntity(PersonelDonemDTO dto);

    @org.mapstruct.Mapping(target = "personel", source = "persId", qualifiedByName = "toPersonel")
    void updateEntityFromDto(PersonelDonemDTO dto, @MappingTarget PersonelDonem entity);

    @org.mapstruct.Named("toPersonel")
    public static com.example.demo.entity.Personel toPersonel(Integer persId) {
        if (persId == null) return null;
        com.example.demo.entity.Personel p = new com.example.demo.entity.Personel();
        p.setPersId(persId);
        return p;
    }
}
