package org.springframework.samples.petclinic.product;

import javax.persistence.Table;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "productTypes")
public class ProductType extends NamedEntity{

}
