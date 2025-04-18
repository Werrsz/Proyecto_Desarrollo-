package com.proyecto_D.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

//@Data
@Entity //sirve para mapear la tabla 
@Table(name = "mascota") //la tabla que se va a mapear va a ser categoria
public class Mascota implements Serializable {

    private static final long serialVersionUID = 1L; //e comunica con el proceso que genera los numeros incrementables de la base de datos
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Long id_mascota;
    private String nombre;
    private String tipo_animal;
    private String descripcion;
    private String edad;
    private String estado;
//    @OneToMany
//    @JoinColumn(name="id_usuario")
//    private List<Rol> roles;

    public Long getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(Long id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}