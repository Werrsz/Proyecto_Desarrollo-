package com.proyecto_D.service;

import com.proyecto_D.domain.Mascota;
import com.proyecto_D.repository.MascotaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MascotaService {
//se incorpora rolService porque cuando se crea un usuario.. tambien se le crea un rool
    @Autowired
    private MascotaRepository mascotaRepository;
    
    @Transactional(readOnly = true)
    public List<Mascota> getMascotas() {
        return mascotaRepository.findAll();
    }
    
    @Transactional
    public void save(Mascota mascota) {
        mascotaRepository.save(mascota);
    }
    
    @Transactional
    public void deleteByID(Long id_mascota) {
        mascotaRepository.deleteById(id_mascota);
    }
    
    @Transactional(readOnly = true)
    public Optional<Mascota> getMascotaById(Long id_mascota) {
        return mascotaRepository.findById(id_mascota);
    }
    
    
    
}