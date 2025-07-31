package com.bdcafe.bdcafe.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bdcafe.bdcafe.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    

}
