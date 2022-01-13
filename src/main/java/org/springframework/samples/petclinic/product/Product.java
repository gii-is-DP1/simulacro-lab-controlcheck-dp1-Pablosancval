package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Products")
public class Product extends NamedEntity{

    @Min(0)
    @NotNull
    double price;

    ProductType productType;
}
