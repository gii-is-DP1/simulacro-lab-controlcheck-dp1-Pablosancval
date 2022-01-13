package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;


    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<ProductType> getAllProductTypes(){
        return productRepository.findAllProductTypes();
    }

    public List<Product> getProductsCheaperThan(Double price) {
        return productRepository.findByPriceLessThan(price);
    }

    public ProductType getProductType(String typeName) {
        return productRepository.findProductTypeByName(typeName);
    }

    public Product save(Product p){
        return null;       
    }

    
}
