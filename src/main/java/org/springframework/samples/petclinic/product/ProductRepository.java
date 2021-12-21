package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface ProductRepository extends CrudRepository{
    List<Product> findAll();
    List<ProductType> findAllProductTypes();
    Optional<Product> findById(int id);
    Product findByName(String name);
    @Query("Select pt FROM producttypes pt WHERE pt.name == name")
    ProductType findPTByName(String name);
    Product save(Product p);
    @Query("SELECT lowprice FROM products lowprice WHERE lowprice.price <= price ORDER BY lowprice.price")
    List<Product> findByPriceLessThan(double price);
}
