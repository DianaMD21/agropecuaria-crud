package com.crud.agropecuaria.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.agropecuaria.models.Product;

public interface IProductService {
	public List<Product> getAll();
	public Optional<Product> getById(Long idProduct);
	public int save(Product p);
	public void delete(Product p);
}
