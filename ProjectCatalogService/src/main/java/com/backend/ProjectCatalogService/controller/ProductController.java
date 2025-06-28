package com.backend.ProjectCatalogService.controller;

import com.backend.ProjectCatalogService.dto.ProductDto;
import com.backend.ProjectCatalogService.models.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping(value="/product/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDto getProductById(@PathVariable Long id){
        ProductDto product=new ProductDto();
        product.setId(id);
        return product;
    }
    @PostMapping("/product")
    public ProductDto createProduct (@RequestBody ProductDto product) {
        return product;
    }
}
