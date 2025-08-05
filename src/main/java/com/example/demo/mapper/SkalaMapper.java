package com.example.demo.mapper;

import com.example.demo.dto.SkalaDto;
import com.example.demo.entity.Skala;
import com.example.demo.entity.SkalaTanim;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface SkalaMapper {

    @Mapping(source = "skalaTanim.skalaTanimNo", target = "skalaTanimNo")
    SkalaDto toDto(Skala entity);

    @Mapping(source = "skalaTanimNo", target = "skalaTanim", qualifiedByName = "toSkalaTanim")
    Skala toEntity(SkalaDto dto);

    @Mapping(source = "skalaTanimNo", target = "skalaTanim", qualifiedByName = "toSkalaTanim")
    void updateEntityFromDto(SkalaDto dto, @MappingTarget Skala entity);

    @Named("toSkalaTanim")
    static SkalaTanim toSkalaTanim(Integer skalaTanimNo) {
        if (skalaTanimNo == null) {
            return null;
        }
        SkalaTanim skalaTanim = new SkalaTanim();
        skalaTanim.setSkalaTanimNo(skalaTanimNo);
        return skalaTanim;
    }
}
