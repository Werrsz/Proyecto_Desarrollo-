package com.proyecto_D.service;

import com.proyecto_D.domain.Cita;
import com.proyecto_D.repository.CitaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CitaService {
//se incorpora rolService porque cuando se crea un usuario.. tambien se le crea un rool
    @Autowired
    private CitaRepository citaRepository;
    
    @Transactional(readOnly = true)
    public List<Cita> getCitas() {
        return citaRepository.findAll();
    }
    
    @Transactional(readOnly = true)
    public Cita getCitaByID(Long id_cita) {
        return citaRepository.findById(id_cita).orElse(null);
    }
    
    @Transactional(readOnly = true)
    public List<Cita> getCitasByDoctor(long doctorID) {
        return citaRepository.getCitasByDoctorID(doctorID);
    }
    
    @Transactional(readOnly = true)
    public List<Cita> getCitasByUser(long id_usuario) {
        return citaRepository.getCitasByUser(id_usuario);
    }
    
    @Transactional
    public void save(Cita cita) {
        citaRepository.save(cita);
    }
}