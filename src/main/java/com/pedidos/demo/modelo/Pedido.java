package com.pedidos.demo.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String numpedido;
	private Date fecharegistro;
	private Date fechaentrega;
	private String numcliente;
	private Long subtotal;
	private Long total;
	
	@OneToMany(mappedBy = "pedido")
    @JsonIgnore
	private List<DetallePedido> lstDetallePedido = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumpedido() {
		return numpedido;
	}

	public void setNumpedido(String numpedido) {
		this.numpedido = numpedido;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public Date getFechaentrega() {
		return fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	public String getNumcliente() {
		return numcliente;
	}

	public void setNumcliente(String numcliente) {
		this.numcliente = numcliente;
	}

	public Long getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Long subtotal) {
		this.subtotal = subtotal;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<DetallePedido> getLstDetallePedido() {
		return lstDetallePedido;
	}

	public void setLstDetallePedido(List<DetallePedido> lstDetallePedido) {
		this.lstDetallePedido = lstDetallePedido;
	}
	
	

}
