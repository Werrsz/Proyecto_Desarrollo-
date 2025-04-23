package com.proyecto_D.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

//@Data
@Entity //sirve para mapear la tabla 
@Table(name = "citas") //la tabla que se va a mapear va a ser categoria
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L; //e comunica con el proceso que genera los numeros incrementables de la base de datos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Long id_cita;
    private String tipo_servicio;
    private String fecha;
    private String estado;
    private Long id_doctor;
    private Long id_usuario;

    public Cita() {
    }

    public Long getId_cita() {
        return id_cita;
    }

    public void setId_cita(Long id_cita) {
        this.id_cita = id_cita;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(Long id_doctor) {
        this.id_doctor = id_doctor;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
    

}
