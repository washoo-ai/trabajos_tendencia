package com.loxasoft.departamentservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "compras")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ncompra;
    private String cedula;
    private String codpro;
    private String cantidad;

    private String totalcompra;

}

