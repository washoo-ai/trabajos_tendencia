package com.loxasoft.departamentservice.controllers;


import com.loxasoft.departamentservice.entity.Compras;
import com.loxasoft.departamentservice.service.ComprasService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class ComprasController {
    private final ComprasService comprasService;

    public ComprasController(ComprasService comprasService) {
        this.comprasService = comprasService;

    }

    @PostMapping
    public Compras createCompras(@RequestBody Compras compras){
        return comprasService.createCompras(compras);
    }

    @GetMapping("/{ncompra}")
    public Compras getComprasByNcompras(@PathVariable Integer ncompras){
        return comprasService.getComprasByCedula(ncompras);
    }

    @GetMapping
    public List<Compras> findAll(){
        return comprasService.findAll();
    }


}
