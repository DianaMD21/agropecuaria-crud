package com.crud.agropecuaria.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.agropecuaria.models.Product;

@Repository
public interface IProduct extends CrudRepository<Product, Long> {

}
