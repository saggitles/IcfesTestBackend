package com.icfes.icfes.controllers;


import com.icfes.icfes.models.Product;
import com.icfes.icfes.repositories.Impl.ProductImpl;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/product")
public class ProductController {

    @Autowired
    ProductImpl productImpl;
    @PostMapping(value = "/create")
    public ResponseEntity<?> createProduct(@RequestBody Product product){
        Product p = productImpl.createProduct(product);
        return ResponseEntity.ok(p);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Product>> getProduct(){
        List<Product> response= productImpl.getProduct();
        return ResponseEntity.ok(response);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody Product product){
        Product response= null;
        try {
            response = productImpl.updateProduct(id, product);
        } catch (BadRequestException e) {
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        boolean response= productImpl.deleteProduct(id);
        return ResponseEntity.ok(response);
    }
}
