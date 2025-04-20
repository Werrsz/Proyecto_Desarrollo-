
package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Usuario;


public interface CitaRepository 
        extends JpaRepository<Usuario, Long>{ 

}