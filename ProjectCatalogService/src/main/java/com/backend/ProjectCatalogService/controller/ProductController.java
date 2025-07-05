package com.backend.ProjectCatalogService.controller;

import com.backend.ProjectCatalogService.dto.ProductDto;
import com.backend.ProjectCatalogService.services.ProductService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService= productService;
    }

    @GetMapping(value="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductDto> getProductById(@PathVariable("id") Long id)
    {
       return productService.getProductById(id);
    }
    @GetMapping()
    public List<ProductDto> getAllProduct(@PathVariable("id") Long id)
    {
        List<ProductDto> lists=new ArrayList<>();
        ProductDto product=new ProductDto();
        lists.add(product);
        return lists;
    }
    @PostMapping()
    public ProductDto createProduct (@RequestBody ProductDto product) {
        return product;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable("id") Long id) {

        return null;
    }

    @PutMapping
    public ProductDto replaceProduct (@RequestBody ProductDto product) {
        return product;
    }
    @PatchMapping("/{id}")
    public ProductDto updateProduct (@PathVariable("id") Long id) {

        return new ProductDto();
    }
}
