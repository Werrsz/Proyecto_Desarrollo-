package com.proyecto_D.controller;

import com.proyecto_D.domain.Voluntariado;
import com.proyecto_D.service.VoluntariadoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.proyecto_D.service.FirebaseStorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

//@RequestMapping("/listaMascotas")
@Controller
public class VoluntariadoController {

    @Autowired
    private VoluntariadoService voluntariadoService; 
    
    @GetMapping("/inscribirse")
    public String inscribirsePage(Model model, HttpSession session) {
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
        
        Voluntariado voluntario = new Voluntariado(correo, nombre, "", "");
        
        model.addAttribute("voluntariado", voluntario);
        
        // Get voluntario List
        var voluntarios = voluntariadoService.getVoluntarios();
        model.addAttribute("voluntariados", voluntarios);
        
        return "inscribirse"; // This should match about.html in src/main/resources/templates
    }
    
    @PostMapping("/inscribirse/submit")
    public String inscribirseSubmit(Voluntariado voluntariado) {
        voluntariadoService.save(voluntariado);
        
        return "redirect:/";
    }
    
    
            
}
