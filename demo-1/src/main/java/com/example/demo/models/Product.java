package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;
	private String nameProduct;
	private Boolean isCreated;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long idProduct, String nameProduct, Boolean isCreated) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.isCreated = isCreated;
		
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Boolean getIsCreated() {
		return isCreated;
	}

	public void setIsCreated(Boolean isCreated) {
		this.isCreated = isCreated;
	}

	
}
