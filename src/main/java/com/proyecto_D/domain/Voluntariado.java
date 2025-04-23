package com.proyecto_D.domain;
import jakarta.persistence.*;
import java.io.Serializable;

//@Data
@Entity //sirve para mapear la tabla 
@Table(name = "voluntariado") //la tabla que se va a mapear va a ser categoria
public class Voluntariado implements Serializable {

    private static final long serialVersionUID = 1L; //e comunica con el proceso que genera los numeros incrementables de la base de datos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_voluntario")
    private Long id_voluntario;
    private String correo;
    private String nombre;
    private String pais;
    private String mensaje;

    public Voluntariado() {
    }
    
    public Voluntariado(String correo, String nombre, String pais, String mensaje) {
        this.correo = correo;
        this.nombre = nombre;
        this.pais = pais;
        this.mensaje = mensaje;
    }

    public Long getId_voluntario() {
        return id_voluntario;
    }

    public void setId_voluntario(Long id_voluntario) {
        this.id_voluntario = id_voluntario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}