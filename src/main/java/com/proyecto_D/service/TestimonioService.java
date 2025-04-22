package com.proyecto_D.service;

import com.proyecto_D.domain.Testimonio;
import com.proyecto_D.repository.TestimonioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestimonioService {
//se incorpora rolService porque cuando se crea un usuario.. tambien se le crea un rool
    @Autowired
    private TestimonioRepository testimonioRepository;
    
    @Transactional
    public void save(Testimonio testimonio) {
        testimonioRepository.save(testimonio);
    }
            
    @Transactional(readOnly = true)
    public List<Testimonio> getTestimonios() {
        return testimonioRepository.findAll();
    }        
}