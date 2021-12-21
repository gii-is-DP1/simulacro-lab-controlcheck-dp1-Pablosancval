package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public List<Product> getProductsCheaperThan(double price){
        List<Product> cheapList = productRepo.findByPriceLessThan(price);
        return cheapList;
    }

    @Transactional
    public ProductType getProductType(String typeName) {
        ProductType type = productRepo.findPTByName(typeName);
        return type;
    }

    public Product save(Product p){
        return null;       
    }

    
}
