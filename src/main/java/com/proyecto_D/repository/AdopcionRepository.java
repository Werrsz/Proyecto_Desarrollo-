
package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Adopcion;
import org.springframework.data.jpa.repository.Query;


public interface AdopcionRepository 
        extends JpaRepository<Adopcion, Long>{ 
    
    @Query(nativeQuery=true,
           value="SELECT id_usuario " +
                 "FROM Adopciones a " +
                 "WHERE a.id_mascota = :id_mascota")
    public Long getPetOwner(
        Long id_mascota
    );
}