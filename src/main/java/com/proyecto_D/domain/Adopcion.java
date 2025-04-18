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
    private String descripcion_historia;
    private String fecha_adopcion;
    private String correo_usuario;
    
}