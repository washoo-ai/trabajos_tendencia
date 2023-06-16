package com.loxasoft.departamentservice.controllers;


import com.loxasoft.departamentservice.entity.Productos;
import com.loxasoft.departamentservice.service.ProductosService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {
    private final ProductosService productosService;

    public ProductosController(ProductosService productosService) {
        this.productosService = productosService;

    }

    @PostMapping
    public Productos createProductos(@RequestBody Productos productos){
        return productosService.createProductos(productos);
    }

    @GetMapping("/{codpro}")
    public Productos getProductosByCodpro(@PathVariable Integer codpro){
        return productosService.getProductosByCodpro(codpro);
    }

    @GetMapping
    public List<Productos> findAll(){
        return productosService.findAll();
    }


}
