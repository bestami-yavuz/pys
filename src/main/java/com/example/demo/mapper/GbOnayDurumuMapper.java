package com.example.demo.mapper;

import com.example.demo.entity.GbOnayDurumu;
import com.example.demo.dto.GbOnayDurumuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface GbOnayDurumuMapper {
    @org.mapstruct.Mapping(target = "persDonemId", source = "personelDonem.persDonemId")
    GbOnayDurumuDTO toDto(GbOnayDurumu entity);

    @org.mapstruct.Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    GbOnayDurumu toEntity(GbOnayDurumuDTO dto);

    @org.mapstruct.Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    void updateEntityFromDto(GbOnayDurumuDTO dto, @MappingTarget GbOnayDurumu entity);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.demo.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.demo.entity.PersonelDonem pd = new com.example.demo.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
