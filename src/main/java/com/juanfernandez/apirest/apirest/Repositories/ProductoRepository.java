package com.juanfernandez.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanfernandez.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
