package com.mahi.javapassion.demo.service;

import com.mahi.javapassion.demo.data.CityRepository;
import com.mahi.javapassion.demo.model.CityDto;
import com.mahi.javapassion.demo.model.CityEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<CityDto> getAllCities() {
        return cityRepository.findAll().stream().map(c -> mapEntityValues(c)).collect(Collectors.toList());
    }

    public CityDto saveCity(CityDto cityDto) {
        CityEntity cityEntity = cityRepository.save(mapDtoValues(cityDto));
        return mapEntityValues(cityEntity);
    }

    private CityDto mapEntityValues(CityEntity entity) {
        CityDto cityDto = new CityDto();
        BeanUtils.copyProperties(entity, cityDto);
        return cityDto;
    }

    private CityEntity mapDtoValues(CityDto cityDto) {
        CityEntity cityEntity = new CityEntity();
        BeanUtils.copyProperties(cityDto, cityEntity);
        return cityEntity;
    }
}
