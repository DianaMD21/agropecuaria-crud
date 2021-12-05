package com.crud.agropecuaria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.agropecuaria.interfaceService.IProductService;
import com.crud.agropecuaria.interfaces.IProduct;
import com.crud.agropecuaria.models.Product;

@Service
public class ProductService implements IProductService {

	public ProductService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private IProduct data;

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return (List<Product>) data.findAll();
	}

	@Override
	public Optional<Product> getById(Long idProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Product p) {
		// TODO Auto-generated method stub

	}

}
