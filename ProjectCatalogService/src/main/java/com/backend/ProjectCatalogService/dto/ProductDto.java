package com.backend.ProjectCatalogService.dto;

import com.backend.ProjectCatalogService.models.BaseModel;
import com.backend.ProjectCatalogService.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends BaseModel {
    private String name;
    private Double price;
    private String imageUrl;
    private String description;
    private Category category;
}
