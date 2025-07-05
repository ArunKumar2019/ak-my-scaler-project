package com.backend.ProjectCatalogService.services;

import com.backend.ProjectCatalogService.dto.ProductDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ResponseEntity<ProductDto> getProductById(Long id);
    List<ProductDto> getAllProducts();
    ProductDto createProduct(ProductDto productDto);
    boolean deleteProduct(Long id);
}
