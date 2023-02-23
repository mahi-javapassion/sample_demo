package com.mahi.javapassion.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CITY")
public class CityEntity {
    @Id
    private Integer city_code;
    private String city_name;
    private Integer city_pincode;
}
