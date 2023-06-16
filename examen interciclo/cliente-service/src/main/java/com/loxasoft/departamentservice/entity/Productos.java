package com.loxasoft.departamentservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productos {
    public Integer getCodpro() {
        return codpro;
    }

    public void setCodpro(Integer codpro) {
        this.codpro = codpro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codpro;
    private String descripcion;
    private String precio;


}
