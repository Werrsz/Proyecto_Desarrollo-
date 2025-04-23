
package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Cita;
import java.util.List;
import org.springframework.data.jpa.repository.Query;


public interface CitaRepository 
        extends JpaRepository<Cita, Long>{ 
    
    
    @Query(nativeQuery=true,
           value="SELECT * " +
                 "FROM Citas c " +
                 "WHERE c.id_doctor = :id_doctor")
    public List<Cita> getCitasByDoctorID(
        long id_doctor
    );
    
    @Query(nativeQuery=true,
           value="SELECT * " +
                 "FROM Citas c " +
                 "WHERE c.id_usuario = :id_usuario")
    public List<Cita> getCitasByUser(
        long id_usuario
    );
}