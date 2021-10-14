package com.pedidos.demo.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pedidos.demo.modelo.dto.PedidoDTO;
import com.pedidos.demo.service.PedidoService;


@RestController
public class PedidosController {
	@Autowired 
	private PedidoService pedidoService;
	
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody PedidoDTO pedidoDTO) {		
		return new ResponseEntity<PedidoDTO>(pedidoService.guardarPedido(pedidoDTO), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(pedidoService.buscarTodos());
	}
	
	@GetMapping("/{idPedido}")
	public ResponseEntity<?> findId(@PathVariable("idPedido") Long idPedido) {
		return ResponseEntity.ok().body(pedidoService.buscarPorId(idPedido));
	}
	
	

}
