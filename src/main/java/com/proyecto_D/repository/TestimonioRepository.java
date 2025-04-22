
package com.proyecto_D.repository;

import com.proyecto_D.domain.Testimonio;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TestimonioRepository 
        extends JpaRepository<Testimonio, Long>{ 
    //se usa para el proceso de login..

}