package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Product;

public interface IProductService {
	public List<Product> getAll();
	public Optional<Product> listarId(Long idProduct);
	public int save(Product p);
	public void delete(Long p);
}
