package com.pedidos.demo.service;

import java.util.List;

import com.pedidos.demo.modelo.Pedido;
import com.pedidos.demo.modelo.dto.PedidoDTO;

public interface PedidoService {

	PedidoDTO guardarPedido(PedidoDTO pedido);
	
	PedidoDTO buscarPorId(Long id);
	
	List<PedidoDTO> buscarTodos();
	
	
}
