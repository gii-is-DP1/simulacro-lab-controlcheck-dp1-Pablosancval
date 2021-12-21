package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "products")
public class Product {

    @Id
    Integer id;

    @Length(min=3, max=50)
    String name;

    @Column(nullable = false)
    @Min(value = 0)
    double price;

    @ManyToOne
    @JoinColumn(name = "producttypes_id")
    ProductType productType;
}
