package com.example.demo.mapper;

import com.example.demo.entity.PersonelDonemSonuc;
import com.example.demo.dto.PersonelDonemSonucDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonelDonemSonucMapper {
    PersonelDonemSonucMapper INSTANCE = Mappers.getMapper(PersonelDonemSonucMapper.class);

    @org.mapstruct.Mapping(target = "persDonemId", source = "personelDonem.persDonemId")
    PersonelDonemSonucDTO toDto(PersonelDonemSonuc entity);

    @org.mapstruct.Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    PersonelDonemSonuc toEntity(PersonelDonemSonucDTO dto);

    @org.mapstruct.Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    void updateEntityFromDto(PersonelDonemSonucDTO dto, @MappingTarget PersonelDonemSonuc entity);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.demo.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.demo.entity.PersonelDonem pd = new com.example.demo.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
