package com.pedidos.demo.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PedidoDTO implements Serializable {
	static final long serialVersionUID = 1L;

	private Long id;
	private String numpedido;
	private Date fecharegistro;
	private Date fechaentrega;
	private String numcliente;
	private Long subtotal;
	private Long total;
	private List<DetalleDTO> lstDetallePedido;

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

	public List<DetalleDTO> getLstDetallePedido() {
		return lstDetallePedido;
	}

	public void setLstDetallePedido(List<DetalleDTO> lstDetallePedido) {
		this.lstDetallePedido = lstDetallePedido;
	}

}
