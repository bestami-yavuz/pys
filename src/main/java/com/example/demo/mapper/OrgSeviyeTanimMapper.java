package com.example.demo.mapper;

import com.example.demo.dto.OrgSeviyeTanimDTO;
import com.example.demo.entity.Donem;
import com.example.demo.entity.OrgSeviyeTanim;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrgSeviyeTanimMapper {

    OrgSeviyeTanimMapper INSTANCE = Mappers.getMapper(OrgSeviyeTanimMapper.class);

    // Entity → DTO dönüşümü
    @Named("entityToDto")
    @Mapping(source = "seviyeId", target = "orgSeviyeId")
    @Mapping(source = "donem.donemNo", target = "donemNo")
    @Mapping(source = "seviyeKod", target = "orgSeviyeKod")
    @Mapping(source = "seviyeAdi", target = "orgSeviyeAd")
    OrgSeviyeTanimDTO toDto(OrgSeviyeTanim entity);

    // DTO → Entity dönüşümü (Donem nesnesini manuel oluşturuyoruz)
    @Named("dtoToEntity")
    @Mapping(source = "orgSeviyeId", target = "seviyeId")
    @Mapping(source = "donemNo", target = "donem", qualifiedByName = "toDonem")
    @Mapping(source = "orgSeviyeKod", target = "seviyeKod")
    @Mapping(source = "orgSeviyeAd", target = "seviyeAdi")
    OrgSeviyeTanim toEntity(OrgSeviyeTanimDTO dto);

    // DTO → Entity güncelleme
    @Named("updateEntityFromDto")
    @Mapping(source = "orgSeviyeId", target = "seviyeId")
    @Mapping(source = "donemNo", target = "donem", qualifiedByName = "toDonem")
    @Mapping(source = "orgSeviyeKod", target = "seviyeKod")
    @Mapping(source = "orgSeviyeAd", target = "seviyeAdi")
    void updateEntityFromDto(OrgSeviyeTanimDTO dto, @MappingTarget OrgSeviyeTanim entity);

    // Donem dönüşümü için named metodu
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
