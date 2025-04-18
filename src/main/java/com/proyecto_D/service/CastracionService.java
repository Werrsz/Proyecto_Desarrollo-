package com.proyecto_D.service;

import com.proyecto_D.domain.Usuario;
import com.proyecto_D.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CastracionService {
//se incorpora rolService porque cuando se crea un usuario.. tambien se le crea un rool
    @Autowired
    private UsuarioRepository usuarioRepository;
    //@Autowired
    //private RolRepository rolRepository;
}