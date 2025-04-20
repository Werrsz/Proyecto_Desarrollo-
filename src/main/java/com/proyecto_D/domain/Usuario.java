package com.proyecto_D.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

//@Data
@Entity //sirve para mapear la tabla 
@Table(name = "usuario") //la tabla que se va a mapear va a ser categoria
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L; //e comunica con el proceso que genera los numeros incrementables de la base de datos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;
    private String correo;
    private boolean tipo_acceso;
    private String nombre;
    private String contrasena;

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean getTipo_acceso() {
        return tipo_acceso;
    }

    public void setTipo_acceso(boolean tipo_acceso) {
        this.tipo_acceso = tipo_acceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}