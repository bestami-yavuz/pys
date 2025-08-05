package com.example.demo.mapper;

import com.example.demo.dto.KadroDTO;
import com.example.demo.entity.Donem;
import com.example.demo.entity.Kadro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface KadroMapper {

    KadroMapper INSTANCE = Mappers.getMapper(KadroMapper.class);

    // Entity -> DTO dönüşümü
    @Mapping(target = "donemNo", source = "donem.donemNo")
    KadroDTO toDto(Kadro entity);

    // DTO -> Entity dönüşümü
    @Mapping(target = "donem", source = "donemNo", qualifiedByName = "toDonem")
    Kadro toEntity(KadroDTO dto);

    // DTO'dan entity güncelleme
    @Mapping(target = "donem", source = "donemNo", qualifiedByName = "toDonem")
    void updateEntityFromDto(KadroDTO dto, @MappingTarget Kadro entity);

    // donemNo'dan Donem entity oluşturma
    @Named("toDonem")
    static Donem toDonem(Integer donemNo) {
        if (donemNo == null) {
            return null;
        }
        Donem donem = new Donem();
        donem.setDonemNo(donemNo);
        return donem;
    }
}
