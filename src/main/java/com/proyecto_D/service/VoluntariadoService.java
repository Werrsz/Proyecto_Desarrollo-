package com.proyecto_D.service;

import com.proyecto_D.domain.Voluntariado;
import com.proyecto_D.repository.VoluntariadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VoluntariadoService {
//se incorpora rolService porque cuando se crea un usuario.. tambien se le crea un rool
    @Autowired
    private VoluntariadoRepository voluntariadoRepository;
    
    @Transactional
    public void save(Voluntariado voluntariado) {
        voluntariadoRepository.save(voluntariado);
    }

}