package com.example.demo.mapper;

import com.example.demo.dto.PersonelDTO;
import com.example.demo.entity.Donem;
import com.example.demo.entity.Personel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonelMapper {

    PersonelMapper INSTANCE = Mappers.getMapper(PersonelMapper.class);

    // Entity → DTO

    // Entity → DTO
    @org.mapstruct.Mapping(source = "donem.donemNo", target = "donemNo")
    PersonelDTO toDto(Personel entity);

    // DTO → Entity (custom Donem mapping with @Named)
    @org.mapstruct.Mapping(source = "donemNo", target = "donem", qualifiedByName = "toDonem")
    Personel toEntity(PersonelDTO dto);

    // DTO → Entity güncelleme
    @org.mapstruct.Mapping(source = "donemNo", target = "donem", qualifiedByName = "toDonem")
    void updateEntityFromDto(PersonelDTO dto, @MappingTarget Personel entity);

    // Named custom mapping method
    @Named("toDonem")
    static Donem toDonem(Integer donemNo) {
        if (donemNo == null) return null;
        Donem donem = new Donem();
        donem.setDonemNo(donemNo);
        return donem;
    }
}
