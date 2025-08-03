package com.bdcafe.bdcafe.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bdcafe.bdcafe.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
 
}