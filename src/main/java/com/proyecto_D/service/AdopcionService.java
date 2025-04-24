package com.proyecto_D.service;

import com.proyecto_D.domain.Adopcion;
import com.proyecto_D.repository.AdopcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdopcionService {
    
    @Autowired
    private AdopcionRepository adopcionRepository;
    
    @Transactional
    public void save(Adopcion adopcion) {
        adopcionRepository.save(adopcion);
    }
    
    @Transactional(readOnly = true)
    public Long getPetOwner(Long id_mascota) {
        return adopcionRepository.getPetOwner(id_mascota);
    }
}