package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "producttypes")
public class ProductType {

    @Id
    Integer id;

    @Column(unique = true)
    @Length(min = 3, max = 50)
    String name;
}
