package com.example.demo.mapper;

import com.example.demo.entity.UniteSonucOnay;
import com.example.demo.dto.UniteSonucOnayDTO;
import com.example.demo.entity.Donem;
import com.example.demo.entity.PersonelDonem;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UniteSonucOnayMapper {

    UniteSonucOnayMapper INSTANCE = Mappers.getMapper(UniteSonucOnayMapper.class);

    // Entity -> DTO dönüşümü
    @Mapping(target = "donemNo", source = "donem.donemNo")
    @Mapping(target = "persDonemId", source = "personelDonem.persDonemId")
    UniteSonucOnayDTO toDto(UniteSonucOnay entity);

    // DTO -> Entity dönüşümü
    @Mapping(target = "donem", source = "donemNo", qualifiedByName = "toDonem")
    @Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    UniteSonucOnay toEntity(UniteSonucOnayDTO dto);

    // DTO'dan var olan entity güncelleme
    @Mapping(target = "donem", source = "donemNo", qualifiedByName = "toDonem")
    @Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    void updateEntityFromDto(UniteSonucOnayDTO dto, @MappingTarget UniteSonucOnay entity);

    // donemNo'dan Donem nesnesine dönüşüm
    @Named("toDonem")
    public static Donem toDonem(Integer donemNo) {
        if (donemNo == null) return null;
        Donem donem = new Donem();
        donem.setDonemNo(donemNo);
        return donem;
    }

    // persDonemId'den PersonelDonem nesnesine dönüşüm
    @Named("toPersonelDonem")
    public static PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        PersonelDonem pd = new PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
