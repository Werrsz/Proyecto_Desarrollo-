
package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Voluntariado;


public interface VoluntariadoRepository 
        extends JpaRepository<Voluntariado, Long>{ 
    //se usa para el proceso de login..

}