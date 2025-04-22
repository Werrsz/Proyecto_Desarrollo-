package com.proyecto_D.controller;

import com.proyecto_D.domain.Testimonio;
import com.proyecto_D.service.TestimonioService;
import jakarta.servlet.http.HttpSession;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import com.proyecto_D.service.FirebaseStorageService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TestimonioController {

    @Autowired
    private TestimonioService testimonioService;
    
    @GetMapping("/testimonios")
    public String testimoniosPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        
        Date currentDate = new Date();
        
        Testimonio testimonio = new Testimonio("", correo, currentDate.toString());
                        
        var testimonios = testimonioService.getTestimonios();
        
        model.addAttribute("testimonio", testimonio);
        model.addAttribute("testimonios", testimonios);
        return "testimonios"; // This should match about.html in src/main/resources/templates
    }
    
    @PostMapping("/testimonios/submit")
    public String inscribirseSubmit(Testimonio testimonio) {
                
        testimonioService.save(testimonio);
        
        return "redirect:/testimonios";
    }
}
