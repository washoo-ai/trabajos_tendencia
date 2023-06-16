package com.loxasoft.departamentservice.controllers;


import com.loxasoft.departamentservice.entity.Clientes;
import com.loxasoft.departamentservice.service.ClientesService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {
    private final ClientesService clientesService;

    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;

    }

    @PostMapping
    public Clientes createClientes(@RequestBody Clientes clientes){
        return clientesService.createClientes(clientes);
    }

    @GetMapping("/{Cedula}")
    public Clientes getClienteByCedula(@PathVariable Integer cedula){
        return clientesService.getClientesByCedula(cedula);
    }

    @GetMapping
    public List<Clientes> findAll(){
        return clientesService.findAll();
    }


}
