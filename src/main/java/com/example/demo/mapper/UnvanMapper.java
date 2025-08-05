package com.example.demo.mapper;

import com.example.demo.entity.Unvan;
import com.example.demo.dto.UnvanDTO;
import com.example.demo.entity.Donem;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UnvanMapper {

    UnvanMapper INSTANCE = Mappers.getMapper(UnvanMapper.class);

    // Entity -> DTO dönüşümü
    @Mapping(target = "donemNo", source = "donem.donemNo")
    UnvanDTO toDto(Unvan entity);

    // DTO -> Entity dönüşümü
    @Mapping(target = "donem", source = "donemNo", qualifiedByName = "toDonem")
    Unvan toEntity(UnvanDTO dto);

    // DTO'dan var olan entity'yi güncelleme
    @Mapping(target = "donem", source = "donemNo", qualifiedByName = "toDonem")
    void updateEntityFromDto(UnvanDTO dto, @MappingTarget Unvan entity);

    // donemNo'dan Donem nesnesine dönüşüm için yardımcı method
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
