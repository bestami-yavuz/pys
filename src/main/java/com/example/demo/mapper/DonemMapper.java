package com.example.demo.mapper;

import com.example.demo.dto.DonemDTO;
import com.example.demo.entity.Donem;
import com.example.demo.entity.SkalaTanim;
import com.example.demo.entity.HarfSkalaTanim;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface DonemMapper {

    @Mapping(source = "skalaTanim.skalaTanimNo", target = "skalaTanimNo")
    @Mapping(source = "harfSkalaTanim.harfSkalaTanimNo", target = "harfSkalaTanimNo")
    DonemDTO toDto(Donem entity);

    @Mapping(target = "skalaTanim", source = "skalaTanimNo", qualifiedByName = "toSkala")
    @Mapping(target = "harfSkalaTanim", source = "harfSkalaTanimNo", qualifiedByName = "toHarfSkala")
    Donem toEntity(DonemDTO dto);

    @Mapping(target = "skalaTanim", source = "skalaTanimNo", qualifiedByName = "toSkala")
    @Mapping(target = "harfSkalaTanim", source = "harfSkalaTanimNo", qualifiedByName = "toHarfSkala")
    void updateEntityFromDto(DonemDTO dto, @MappingTarget Donem entity);

    @Named("toSkala")
    static SkalaTanim toSkala(Integer skalaTanimNo) {
        if (skalaTanimNo == null) {
            return null;
        }
        SkalaTanim skalaTanim = new SkalaTanim();
        skalaTanim.setSkalaTanimNo(skalaTanimNo);
        return skalaTanim;
    }

    @Named("toHarfSkala")
    static HarfSkalaTanim toHarfSkala(Integer harfSkalaTanimNo) {
        if (harfSkalaTanimNo == null) {
            return null;
        }
        HarfSkalaTanim harfSkalaTanim = new HarfSkalaTanim();
        harfSkalaTanim.setHarfSkalaTanimNo(harfSkalaTanimNo);
        return harfSkalaTanim;
    }
}
