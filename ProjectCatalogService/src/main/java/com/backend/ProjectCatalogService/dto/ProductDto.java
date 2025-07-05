package com.backend.ProjectCatalogService.dto;

import com.backend.ProjectCatalogService.models.BaseModel;
import com.backend.ProjectCatalogService.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends BaseModel {
    private String title;
    private Double price;
    private String description;
    private String imageUrl;
    private Category category;
}
