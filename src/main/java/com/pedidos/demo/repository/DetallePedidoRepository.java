package com.pedidos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedidos.demo.modelo.DetallePedido;

public interface DetallePedidoRepository  extends JpaRepository<DetallePedido, Long>{

}
