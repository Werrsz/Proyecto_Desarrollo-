package com.proyecto_D.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Data;

//@Data
@Entity //sirve para mapear la tabla 
@Table(name = "donaciones") //la tabla que se va a mapear va a ser categoria
public class Donacion implements Serializable {

    private static final long serialVersionUID = 1L; //e comunica con el proceso que genera los numeros incrementables de la base de datos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_donacion")
    private Long id_donacion;
    private Long id_necesidad;
    private String fecha;
    private Long cantidad;
    private Long id_usuario;

    public Donacion() {
    }

    public Long getId_necesidad() {
        return id_necesidad;
    }

    public void setId_necesidad(Long id_necesidad) {
        this.id_necesidad = id_necesidad;
    }

    public Long getId_donacion() {
        return id_donacion;
    }

    public void setId_donacion(Long id_donacion) {
        this.id_donacion = id_donacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
}