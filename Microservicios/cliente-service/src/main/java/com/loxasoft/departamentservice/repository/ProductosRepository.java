package com.loxasoft.departamentservice.repository;
import com.loxasoft.departamentservice.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;


public interface ProductosRepository extends JpaRepository<Productos, Integer> {



}