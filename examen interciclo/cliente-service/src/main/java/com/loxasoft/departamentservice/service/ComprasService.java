package com.loxasoft.departamentservice.service;

import com.loxasoft.departamentservice.entity.Clientes;
import com.loxasoft.departamentservice.entity.Compras;

import com.loxasoft.departamentservice.repository.ClientesRepository;
import com.loxasoft.departamentservice.repository.ComprasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprasService {

    private final ComprasRepository comprasRepository;

    public ComprasService(ComprasRepository comprasRepository) {
        this.comprasRepository = comprasRepository;
    }

    public Compras createCompras (Compras compras){

        return comprasRepository.save(compras);
    }




    public Compras getComprasByCedula(Integer ncompra) {

        return comprasRepository.findById(ncompra).get();
    }

    public List<Compras> findAll(){
        return comprasRepository.findAll();
    }



}

