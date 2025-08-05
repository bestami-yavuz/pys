package com.example.demo.mapper;

import com.example.demo.entity.Transfer;
import com.example.demo.dto.TransferDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TransferMapper {
    TransferMapper INSTANCE = Mappers.getMapper(TransferMapper.class);

    @org.mapstruct.Mapping(target = "persDonemId", source = "personelDonem.persDonemId")
    TransferDTO toDto(Transfer entity);
    @org.mapstruct.Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    Transfer toEntity(TransferDTO dto);

    @org.mapstruct.Mapping(target = "personelDonem", source = "persDonemId", qualifiedByName = "toPersonelDonem")
    void updateEntityFromDto(TransferDTO dto, @MappingTarget Transfer entity);

    @org.mapstruct.Named("toPersonelDonem")
    public static com.example.demo.entity.PersonelDonem toPersonelDonem(Integer persDonemId) {
        if (persDonemId == null) return null;
        com.example.demo.entity.PersonelDonem pd = new com.example.demo.entity.PersonelDonem();
        pd.setPersDonemId(persDonemId);
        return pd;
    }
}
