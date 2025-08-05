package com.example.demo.mapper;

import com.example.demo.dto.OrgDTO;
import com.example.demo.entity.Org;
import com.example.demo.entity.OrgSeviyeTanim;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrgMapper {

    OrgMapper INSTANCE = Mappers.getMapper(OrgMapper.class);

    // Entity -> DTO dönüşümü
    @Mapping(source = "orgId", target = "orgId")
    @Mapping(source = "donemNo", target = "donemNo")
    @Mapping(source = "orgKod", target = "orgKod")
    @Mapping(source = "orgAd", target = "orgAd")
    @Mapping(source = "seviye.seviyeKod", target = "seviyeKod", qualifiedByName = "toSeviyeKod")
    @Mapping(source = "ustOrgKod", target = "ustOrgKod")
    @Mapping(source = "oper", target = "oper")
    @Mapping(source = "operSaat", target = "operSaat")
    OrgDTO toDto(Org entity);

    // DTO -> Entity dönüşümü
    @Mapping(source = "orgId", target = "orgId")
    @Mapping(source = "donemNo", target = "donemNo")
    @Mapping(source = "orgKod", target = "orgKod")
    @Mapping(source = "orgAd", target = "orgAd")
    @Mapping(source = "seviyeKod", target = "seviye", qualifiedByName = "toOrgSeviyeTanim")
    @Mapping(source = "ustOrgKod", target = "ustOrgKod")
    @Mapping(source = "oper", target = "oper")
    @Mapping(source = "operSaat", target = "operSaat")
    Org toEntity(OrgDTO dto);

    // DTO ile entity güncelleme
    @Mapping(source = "donemNo", target = "donemNo")
    @Mapping(source = "orgKod", target = "orgKod")
    @Mapping(source = "orgAd", target = "orgAd")
    @Mapping(source = "seviyeKod", target = "seviye", qualifiedByName = "toOrgSeviyeTanim")
    @Mapping(source = "ustOrgKod", target = "ustOrgKod")
    @Mapping(source = "oper", target = "oper")
    @Mapping(source = "operSaat", target = "operSaat")
    void updateEntityFromDto(OrgDTO dto, @MappingTarget Org entity);

    // Named metotlar

    @Named("toSeviyeKod")
    static String toSeviyeKod(String seviyeKod) {
        return seviyeKod; // Basit string dönüşümü, ihtiyaç varsa burayı özelleştir
    }

    @Named("toOrgSeviyeTanim")
    static OrgSeviyeTanim toOrgSeviyeTanim(String seviyeKod) {
        if (seviyeKod == null) {
            return null;
        }
        OrgSeviyeTanim seviye = new OrgSeviyeTanim();
        seviye.setSeviyeKod(seviyeKod);
        return seviye;
    }
}
