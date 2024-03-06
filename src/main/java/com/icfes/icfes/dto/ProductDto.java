package com.icfes.icfes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    private Long id;
    private String name;
    private String material;
    private String type;
    private String price;
    private int units;
    private String description;
    private float weight;
    private float length;
    private float width;
    private String color;
}