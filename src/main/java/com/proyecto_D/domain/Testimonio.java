package com.proyecto_D.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

//@Data
@Entity //sirve para mapear la tabla 
@Table(name = "testimonios") //la tabla que se va a mapear va a ser categoria
public class Testimonio implements Serializable {

    private static final long serialVersionUID = 1L; //e comunica con el proceso que genera los numeros incrementables de la base de datos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_testimonios")
    private int id_testimonios;
    private String descripcion;
    private String correo;
    private String fecha;

    public Testimonio() {
        Date currentDate = new Date();
        this.fecha = currentDate.toString();
    }

    public Testimonio(String descripcion, String correo, String fecha) {
        this.descripcion = descripcion;
        this.correo = correo;
        this.fecha = fecha;
    }

    public int getId_testimonios() {
        return id_testimonios;
    }

    public void setId_testimonios(int id_testimonios) {
        this.id_testimonios = id_testimonios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}