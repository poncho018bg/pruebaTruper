package com.pedidos.demo.modelo.dto;

import java.io.Serializable;

public class DetalleDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nomarticulo;
	private String codigoarticulo;
	private Long precio;
	private Long cantidad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomarticulo() {
		return nomarticulo;
	}

	public void setNomarticulo(String nomarticulo) {
		this.nomarticulo = nomarticulo;
	}

	public String getCodigoarticulo() {
		return codigoarticulo;
	}

	public void setCodigoarticulo(String codigoarticulo) {
		this.codigoarticulo = codigoarticulo;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

}
