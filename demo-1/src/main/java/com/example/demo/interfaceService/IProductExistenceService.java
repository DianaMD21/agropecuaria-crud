package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.ProductExistence;

public interface IProductExistenceService {
	public List<ProductExistence> getAll();
	public Optional<ProductExistence> listarId(Long idProduct);
	public int save(ProductExistence pe);
	public void delete(Long pe);
}
