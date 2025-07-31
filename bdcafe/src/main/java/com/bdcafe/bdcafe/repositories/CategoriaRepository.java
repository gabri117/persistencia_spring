package com.bdcafe.bdcafe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdcafe.bdcafe.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {


    
}