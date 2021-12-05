package com.crud.agropecuaria.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.crud.agropecuaria.models.Product;

public interface IProduct extends CrudRepository<Product, Long>{
	
}
