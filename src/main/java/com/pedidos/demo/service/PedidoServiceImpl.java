package com.pedidos.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedidos.demo.modelo.DetallePedido;
import com.pedidos.demo.modelo.Pedido;
import com.pedidos.demo.modelo.dto.DetalleDTO;
import com.pedidos.demo.modelo.dto.PedidoDTO;
import com.pedidos.demo.repository.DetallePedidoRepository;
import com.pedidos.demo.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private DetallePedidoRepository detallePedidoRepository;

	@Override
	@Transactional
	public PedidoDTO guardarPedido(PedidoDTO pedido) {
		PedidoDTO pedidodtosv = new PedidoDTO();
		Pedido ped = new Pedido();
		ped.setFechaentrega(pedido.getFechaentrega());
		ped.setFecharegistro(pedido.getFecharegistro());
		ped.setId(null);
		ped.setNumcliente(pedido.getNumcliente());
		ped.setNumpedido(pedido.getNumpedido());
		ped.setSubtotal(pedido.getSubtotal());
		ped.setTotal(pedido.getTotal());
		ped.setLstDetallePedido(new ArrayList<>());

		Pedido pedidosv = pedidoRepository.save(ped);
		pedido.setId(pedidosv.getId());
		pedido.getLstDetallePedido().forEach(e -> {
			DetallePedido detall = new DetallePedido();
			detall.setCantidad(e.getCantidad());
			detall.setCodigoarticulo(e.getCodigoarticulo());
			detall.setId(null);
			detall.setNomarticulo(e.getNomarticulo());
			detall.setPedido(pedidosv);
			detall.setPrecio(e.getPrecio());
			DetallePedido dp = detallePedidoRepository.save(detall);
			e.setId(dp.getId());
			ped.getLstDetallePedido().add(detall);
		});

		return pedido;
	}

	@Override
	public PedidoDTO buscarPorId(Long id) {

		Pedido pedido = pedidoRepository.findById(id).get();
		PedidoDTO dto = new PedidoDTO();
		dto.setFechaentrega(pedido.getFechaentrega());
		dto.setFecharegistro(pedido.getFecharegistro());
		dto.setId(pedido.getId());
		dto.setNumcliente(pedido.getNumcliente());
		dto.setNumpedido(pedido.getNumcliente());
		dto.setSubtotal(pedido.getSubtotal());
		dto.setTotal(pedido.getTotal());
		dto.setLstDetallePedido(new ArrayList<>());

		pedido.getLstDetallePedido().forEach(e -> {
			DetalleDTO dtlle = new DetalleDTO();
			dtlle.setCantidad(e.getCantidad());
			dtlle.setCodigoarticulo(e.getCodigoarticulo());
			dtlle.setId(e.getId());
			dtlle.setNomarticulo(e.getNomarticulo());
			dtlle.setPrecio(e.getPrecio());
			dto.getLstDetallePedido().add(dtlle);
		});

		return dto;
	}

	@Override
	public List<PedidoDTO> buscarTodos() {
		List<Pedido> pedido = pedidoRepository.findAll();
		List<PedidoDTO> lstdto = new ArrayList<>();
		pedido.forEach(a -> {
			PedidoDTO dto = new PedidoDTO();
			dto.setFechaentrega(a.getFechaentrega());
			dto.setFecharegistro(a.getFecharegistro());
			dto.setId(a.getId());
			dto.setNumcliente(a.getNumcliente());
			dto.setNumpedido(a.getNumcliente());
			dto.setSubtotal(a.getSubtotal());
			dto.setTotal(a.getTotal());
			dto.setLstDetallePedido(new ArrayList<>());

			a.getLstDetallePedido().forEach(e -> {
				DetalleDTO dtlle = new DetalleDTO();
				dtlle.setCantidad(e.getCantidad());
				dtlle.setCodigoarticulo(e.getCodigoarticulo());
				dtlle.setId(e.getId());
				dtlle.setNomarticulo(e.getNomarticulo());
				dtlle.setPrecio(e.getPrecio());
				dto.getLstDetallePedido().add(dtlle);

			});
			lstdto.add(dto);
		});
		return lstdto;
	}

}
