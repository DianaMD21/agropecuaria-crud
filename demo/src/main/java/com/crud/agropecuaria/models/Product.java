package com.crud.agropecuaria.models;

import java.util.List;

public class Product {
	private String idProduct;
	private String nameProduct;
	private Boolean isCreated;
	private List<Formula> myFormulas;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String idProduct, String nameProduct, Boolean isCreated, List<Formula> myFormulas) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.isCreated = isCreated;
		this.myFormulas = myFormulas;
	}
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
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
