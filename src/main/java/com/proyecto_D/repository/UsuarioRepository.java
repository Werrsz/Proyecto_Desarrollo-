package com.proyecto_D.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto_D.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository
        extends JpaRepository<Usuario, Long> {

    /*
    //se usa para el proceso de login..
    Usuario findByUsername(String username);

    //se usa para buscar un registro de usuario en el proceso de activacion de un nuevo usuario
    Usuario findByUsernameAndPassword(String username, String Password);

    //se utiliza para validar si dentro de la tabla usuario ya existe un registro con el username o el correo indicados
    Usuario findByUsernameOrCorreo(String username, String correo);

    //se utiliza para validar si dentro de la tabla usuario ya existe un registro con el username o el correo indicados
    boolean existsByUsernameOrCorreo(String username, String correo);
    */
    
    // Consulta SQL
    @Query(nativeQuery=true,
           value="SELECT * " +
                 "FROM Usuario u " +
                 "WHERE u.correo = :correo ")
    public Usuario findByEmail(
        String correo
    );
    
    @Query(nativeQuery=true,
           value="SELECT * " +
                 "FROM Usuario u " +
                 "WHERE u.correo = :correo and u.contrasena = :contrasena")
    public Usuario findByEmailAndPassword(
        String correo, 
        String contrasena
    );
    
    @Query(nativeQuery=true,
           value="SELECT * " +
                 "FROM Usuario u " +
                 "WHERE u.tipo_acceso = 1")
    public List<Usuario> getAdminUsers();
}
