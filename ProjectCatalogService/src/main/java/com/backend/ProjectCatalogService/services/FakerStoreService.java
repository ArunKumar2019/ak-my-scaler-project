package com.backend.ProjectCatalogService.services;

import com.backend.ProjectCatalogService.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakerStoreService implements ProductService{

    private RestTemplate restTemplate;

    public FakerStoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public ResponseEntity<ProductDto> getProductById(Long id) {
        ResponseEntity<ProductDto> res=restTemplate.getForEntity("https://fakestoreapi.com/products/"+id, ProductDto.class);
        return res;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long id) {
    return false;
    }
}
