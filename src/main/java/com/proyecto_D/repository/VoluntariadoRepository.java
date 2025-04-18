
package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Voluntariado;


public interface VoluntariadoRepository 
        extends JpaRepository<Voluntariado, Long>{ 
    //se usa para el proceso de login..
    Voluntariado findByUsername(String username);
    //se usa para buscar un registro de usuario en el proceso de activacion de un nuevo usuario
     Voluntariado findByUsernameAndPassword(String username, String Password);
    //se utiliza para validar si dentro de la tabla usuario ya existe un registro con el username o el correo indicados
    Voluntariado findByUsernameOrCorreo(String username, String correo);
    //se utiliza para validar si dentro de la tabla usuario ya existe un registro con el username o el correo indicados
    boolean existsByUsernameOrCorreo(String username, String correo);

}