package com.icfes.icfes.repositories.Impl;


import com.icfes.icfes.dto.ProductDto;
import com.icfes.icfes.mappers.ProductMapper;
import com.icfes.icfes.models.Product;
import com.icfes.icfes.repositories.ProductRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImpl {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductMapperImpl productMapperImpl;


    public Product createProduct(ProductDto product) {
        Product p = productMapperImpl.sourceToDestination(product);
        return productRepository.save(p);

    }

    public List<ProductDto> getProduct() {
        return productRepository.findAll().stream().map(product -> productMapperImpl.destinationToSource(product)).toList();
    }

    public Product updateProduct(Long id, ProductDto newProduct) throws BadRequestException {
        Product product = productRepository.findById(id).orElseThrow(() -> new BadRequestException("Product does not exist with id: " + id));;
        product.setPrice(newProduct.getPrice());
        product.setType(newProduct.getType());
        productRepository.save(product);

        return product;
    }

    public boolean deleteProduct(Long id) {
        productRepository.deleteById(id);
        return true;
    }
}

