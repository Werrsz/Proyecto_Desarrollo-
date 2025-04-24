package com.proyecto_D.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

//@Data
@Entity //sirve para mapear la tabla 
@Table(name = "adopciones") //la tabla que se va a mapear va a ser categoria
public class Adopcion implements Serializable {

    private static final long serialVersionUID = 1L; //e comunica con el proceso que genera los numeros incrementables de la base de datos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adopcion")
    private Long id_adopcion;
    private Long id_mascota;
    private String fecha_adopcion;
    private Long id_usuario;

    public Adopcion() {
    }
    
    public Long getId_adopcion() {
        return id_adopcion;
    }

    public void setId_adopcion(Long id_adopcion) {
        this.id_adopcion = id_adopcion;
    }

    public Long getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(Long id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getFecha_adopcion() {
        return fecha_adopcion;
    }

    public void setFecha_adopcion(String fecha_adopcion) {
        this.fecha_adopcion = fecha_adopcion;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
       
}