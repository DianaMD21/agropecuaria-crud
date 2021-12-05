package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IProductService;
import com.example.demo.interfaces.IProduct;
import com.example.demo.models.Product;

@Service
public class ProductService implements IProductService {


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