package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class ExistenciaProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;
	private String idSuplidor;
	private String unidadMedida;
	private float valorUnidad;
	private float cantidad;
	
	public ExistenciaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExistenciaProducto(Long idProduct, String idSuplidor, String unidadMedida, float valorUnidad, int cantidad) {
		super();
		this.idProduct = idProduct;
		this.idSuplidor=idSuplidor;
		this.unidadMedida=unidadMedida;
		this.valorUnidad=valorUnidad;
		this.cantidad=cantidad;
		
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getIdSuplidor() {
		return idSuplidor;
	}

	public void setIdSuplidor(String idSuplidor) {
		this.idSuplidor = idSuplidor;
	}

	public float getValorUnidad() {
		return valorUnidad;
	}

	public void setValorUnidad(float valorUnidad) {
		this.valorUnidad = valorUnidad;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	
}
