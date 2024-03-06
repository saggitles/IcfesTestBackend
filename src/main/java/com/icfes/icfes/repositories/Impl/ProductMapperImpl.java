package com.icfes.icfes.repositories.Impl;

import com.icfes.icfes.dto.ProductDto;
import com.icfes.icfes.mappers.ProductMapper;
import com.icfes.icfes.models.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {


    @Override
    public Product sourceToDestination(ProductDto source) {

        if ( source == null ) {
            return null;
        }
        Product product = new Product();
        product.setId( source.getId() );
        product.setName( source.getName() );
        product.setMaterial( source.getMaterial() );
        product.setType( source.getType() );
        product.setPrice( source.getPrice() );
        product.setUnits( source.getUnits() );
        product.setDescription( source.getDescription() );
        product.setWeight( source.getWeight() );
        product.setLength( source.getLength() );
        product.setWeight( source.getWeight() );
        product.setColor( source.getColor() );
        return product;
    }

    @Override
    public ProductDto destinationToSource(Product destination) {
        if ( destination == null ) {
            return null;
        }
        ProductDto productDto = new ProductDto();
        productDto.setId( destination.getId() );
        productDto.setName( destination.getName() );
        productDto.setMaterial( destination.getMaterial() );
        productDto.setType( destination.getType() );
        productDto.setPrice( destination.getPrice() );
        productDto.setUnits( destination.getUnits() );
        productDto.setDescription( destination.getDescription() );
        productDto.setWeight( destination.getWeight() );
        productDto.setColor( destination.getColor() );
        return productDto;
    }
}
