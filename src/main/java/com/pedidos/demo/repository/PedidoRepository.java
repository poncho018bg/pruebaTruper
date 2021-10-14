package com.pedidos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedidos.demo.modelo.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
