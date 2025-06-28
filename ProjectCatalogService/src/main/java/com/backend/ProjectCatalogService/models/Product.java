package com.backend.ProjectCatalogService.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Product extends  BaseModel{

    private String name;
    private Double price;
    private String imageUrl;
    private String description;
    private Category category;
    private Boolean isPrimeSaleEligibale;
    private Double commission;


}
