package com.backend.ProjectCatalogService.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class Category extends BaseModel{
    private String name;
    private String description;
    private List<Product> products;
}
