package com.example.demo.models;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductExistence")
public class ProductExistence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExistence;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;
	private String idSuplier;
	private Boolean isCreated;
	private float amount;
	private String metricUnit;
	private float costPerUnit;
	private Date indate;
	private Date expdate;
	
	
	public ProductExistence(Long idExistence, Long idProduct, String idSuplier, Boolean isCreated, float amount,
			String metricUnit, float costPerUnit) {
		super();
		this.idExistence = idExistence;
		this.idProduct = idProduct;
		this.idSuplier = idSuplier;
		this.isCreated = isCreated;
		this.amount = amount;
		this.metricUnit = metricUnit;
		this.costPerUnit = costPerUnit;
		this.indate = null;
		this.expdate = null;
	}
	
	public Long getIdExistence() {
		return idExistence;
	}
	public void setIdExistence(Long idExistence) {
		this.idExistence = idExistence;
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getIdSuplier() {
		return idSuplier;
	}
	public void setIdSuplier(String idSuplier) {
		this.idSuplier = idSuplier;
	}
	public Boolean getIsCreated() {
		return isCreated;
	}
	public void setIsCreated(Boolean isCreated) {
		this.isCreated = isCreated;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getMetricUnit() {
		return metricUnit;
	}
	public void setMetricUnit(String metricUnit) {
		this.metricUnit = metricUnit;
	}
	public float getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(float costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public Date getIndate() {
		return indate;
	}
	public void setIndate(Date indate) {
		this.indate = indate;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	
	

	
}
