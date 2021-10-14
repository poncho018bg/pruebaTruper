package com.pedidos.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detallepedido")
public class DetallePedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "idpedido")
	private Pedido pedido;

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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
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
