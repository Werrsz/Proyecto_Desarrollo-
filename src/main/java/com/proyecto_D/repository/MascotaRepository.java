package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Mascota;

public interface MascotaRepository
        extends JpaRepository<Mascota, Long> {

}
