
package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Donacion;

public interface DonacionRepository 
        extends JpaRepository<Donacion, Long>{
}