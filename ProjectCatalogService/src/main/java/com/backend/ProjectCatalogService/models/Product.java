package com.backend.ProjectCatalogService.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Product extends  BaseModel{

    private String title;
    private Double price;
    private String description;
    private String imageUrl;
    private Category category;
    private Boolean isPrimeSaleEligibale;
    private Double commission;


}
