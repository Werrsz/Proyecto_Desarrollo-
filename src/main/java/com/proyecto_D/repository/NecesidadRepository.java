
package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Necesidad;


public interface NecesidadRepository 
        extends JpaRepository<Necesidad, Long>{ 
    
}