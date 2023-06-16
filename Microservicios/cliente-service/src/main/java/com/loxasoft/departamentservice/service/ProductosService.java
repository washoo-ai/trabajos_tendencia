package com.loxasoft.departamentservice.service;

import com.loxasoft.departamentservice.entity.Productos;
import com.loxasoft.departamentservice.repository.ProductosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {
    private final ProductosRepository productosRepository;

    public ProductosService(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    public Productos createProductos (Productos productos){

        return productosRepository.save(productos);
    }

    public Productos getProductosByCodpro(Integer codpro) {

        return productosRepository.findById(codpro).get();
    }


    public List<Productos> findAll(){
        return productosRepository.findAll();
    }
}


