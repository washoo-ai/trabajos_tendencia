package com.loxasoft.departamentservice.service;

import com.loxasoft.departamentservice.entity.Clientes;
import com.loxasoft.departamentservice.repository.ClientesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {
    private final ClientesRepository clientesRepository;

    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public Clientes createClientes (Clientes clientes){

        return clientesRepository.save(clientes);
    }

    public Clientes getClientesByCedula(Integer cedula) {

        return clientesRepository.findById(cedula).get();
    }

    public List<Clientes> findAll(){
        return clientesRepository.findAll();
    }
}
