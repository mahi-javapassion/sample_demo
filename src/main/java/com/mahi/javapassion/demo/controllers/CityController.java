package com.mahi.javapassion.demo.controllers;

import com.mahi.javapassion.demo.model.CityDto;
import com.mahi.javapassion.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sample-demo")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public List<CityDto> getCities() {
        return cityService.getAllCities();
    }

    @PostMapping
    public CityDto saveCity(@RequestBody CityDto cityDto) {
        return cityService.saveCity(cityDto);
    }
}
