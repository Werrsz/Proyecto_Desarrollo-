
package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Usuario;


public interface CastracionRepository 
        extends JpaRepository<Usuario, Long>{ 

}