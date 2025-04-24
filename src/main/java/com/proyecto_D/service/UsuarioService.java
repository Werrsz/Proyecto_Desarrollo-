package com.proyecto_D.service;

import com.proyecto_D.domain.Usuario;
import com.proyecto_D.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {
//se incorpora rolService porque cuando se crea un usuario.. tambien se le crea un rool
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Transactional
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    
    @Transactional(readOnly = true)
    public Usuario findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
    
    @Transactional(readOnly = true)
    public Usuario findByEmailAndPassword(String email, String password) {
        return usuarioRepository.findByEmailAndPassword(email, password);
    }
    
    @Transactional(readOnly = true)
    public Usuario getUsuario(Usuario usuario) {
        return usuarioRepository.findById(usuario.getId_usuario()).orElse(null);
    }
    
    @Transactional(readOnly = true)
    public List<Usuario> getAdminUsers() {
        return usuarioRepository.getAdminUsers();
    }
    
    @Transactional(readOnly = true)
    public Usuario getUsuarioByID(Long id_usuario) {
        if (id_usuario != null) {
            return usuarioRepository.findById(id_usuario).orElse(null);
        }
        
        return null;
    }
    
    /*
    @Transactional(readOnly = true)
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    

    @Transactional(readOnly = true)
    public Usuario getUsuarioPorUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Transactional(readOnly = true)
    public Usuario getUsuarioPorUsernameYPassword(String username, String password) {
        return usuarioRepository.findByUsernameAndPassword(username, password);
    }

    @Transactional(readOnly = true)
    public Usuario getUsuarioPorUsernameOCorreo(String username, String correo) {
        return usuarioRepository.findByUsernameOrCorreo(username, correo);
    }

    @Transactional(readOnly = true)
    public boolean existeUsuarioPorUsernameOCorreo(String username, String correo) {
        return usuarioRepository.existsByUsernameOrCorreo(username, correo);
    }

//    @Transactional
//    public void save(Usuario usuario, boolean crearRolUser) {
//        usuario=usuarioRepository.save(usuario);
//        if (crearRolUser) {  //Si se está creando el usuario, se crea el rol por defecto "USER"
//            Rol rol = new Rol();
//            rol.setNombre("USER");
//            rol.setIdUsuario(usuario.getIdUsuario());
//            rolRepository.save(rol);
//        }
//    }

    @Transactional
    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }
    */
}