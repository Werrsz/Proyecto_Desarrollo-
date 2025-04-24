package com.proyecto_D.service;

import com.proyecto_D.domain.Necesidad;
import com.proyecto_D.repository.NecesidadRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NecesidadService {
//se incorpora rolService porque cuando se crea un usuario.. tambien se le crea un rool

    @Autowired
    private NecesidadRepository necesidadRepository;

    @Transactional
    public void save(Necesidad necesidad) {
        necesidadRepository.save(necesidad);
    }

    @Transactional(readOnly = true)
    public List<Necesidad> getNecesidades() {
        return necesidadRepository.findAll();
    }

    @Transactional
    public void deleteByID(Long id_necesidad) {
        necesidadRepository.deleteById(id_necesidad);
    }

    @Transactional(readOnly = true)
    public Necesidad getNecesidadByID(Long id_necesidad) {
        return necesidadRepository.findById(id_necesidad).orElse(null);
    }

}
