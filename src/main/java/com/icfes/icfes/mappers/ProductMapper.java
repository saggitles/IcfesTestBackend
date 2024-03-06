package com.icfes.icfes.mappers;
import com.icfes.icfes.dto.ProductDto;
import com.icfes.icfes.models.Product;
import org.mapstruct.Mapping;
import org.mapstruct.Mapper;
@Mapper
public interface ProductMapper {
    @Mapping(target = "id", source = "ProductDto.id")
    @Mapping(target = "name", source = "ProductDto.name")
    @Mapping(target = "material", source = "ProductDto.material")
    @Mapping(target = "type", source = "ProductDto.type")
    @Mapping(target = "price", source = "ProductDto.price")
    @Mapping(target = "units", source = "ProductDto.units")
    @Mapping(target = "description", source = "ProductDto.description")
    @Mapping(target = "weight", source = "ProductDto.weight")
    @Mapping(target = "length", source = "ProductDto.length")
    @Mapping(target = "width", source = "ProductDto.width")
    @Mapping(target = "color", source = "ProductDto.color")
    Product sourceToDestination(ProductDto source);
    @Mapping(target = "id", source = "Product.id")
    @Mapping(target = "name", source = "Product.name")
    @Mapping(target = "material", source = "Product.material")
    @Mapping(target = "type", source = "Product.type")
    @Mapping(target = "price", source = "Product.price")
    @Mapping(target = "units", source = "Product.units")
    @Mapping(target = "description", source = "Product.description")
    @Mapping(target = "weight", source = "Product.weight")
    @Mapping(target = "length", source = "Product.length")
    @Mapping(target = "width", source = "Product.width")
    @Mapping(target = "color", source = "Product.color")

    ProductDto destinationToSource(Product destination);
}
