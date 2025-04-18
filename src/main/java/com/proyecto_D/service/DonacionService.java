package com.proyecto_D.service;

import com.proyecto_D.domain.Donacion;
import com.proyecto_D.repository.DonacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DonacionService {
//se incorpora rolService porque cuando se crea un usuario.. tambien se le crea un rool
    @Autowired
    private DonacionRepository donacionRepository;
    
}