package com.crud.agropecuaria.models;

import java.util.List;

public class Formula {
	private Long idProduct;
	private String idFormula;
	private String name;
	private Boolean isActive;
	private List<Product> myPoducts;
	
	public Formula(Long idProduct, String idFormula, String name, Boolean isActive, List<Product> myPoducts) {
		super();
		this.idProduct = idProduct;
		this.idFormula = idFormula;
		this.name = name;
		this.isActive = isActive;
		this.myPoducts = myPoducts;
	}
	public Formula() {
		super();
	}
	
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getIdFormula() {
		return idFormula;
	}
	public void setIdFormula(String idFormula) {
		this.idFormula = idFormula;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public List<Product> getMyPoducts() {
		return myPoducts;
	}
	public void setMyPoducts(List<Product> myPoducts) {
		this.myPoducts = myPoducts;
	}
}
