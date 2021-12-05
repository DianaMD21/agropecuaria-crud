package com.crud.agropecuaria.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Product")
public class Product {
	private Long idProduct;
	private String nameProduct;
	private Boolean isCreated;
	private List<Formula> myFormulas;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Long idProduct, String nameProduct, Boolean isCreated, List<Formula> myFormulas) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.isCreated = isCreated;
		this.myFormulas = myFormulas;
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
	public List<Formula> getMyFormulas() {
		return myFormulas;
	}
	public void setMyFormulas(List<Formula> myFormulas) {
		this.myFormulas = myFormulas;
	}
}
