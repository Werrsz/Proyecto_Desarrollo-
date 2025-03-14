/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto_D;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author valer
 */
@Controller
public class PageController {
    @GetMapping("/")
    public String homePage() {
        return "about"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/listaMascotas")
    public String listaMascotasPage() {
        return "listaMascotas"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/necesidades")
    public String necesidadesPage() {
        return "necesidades"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/registro")
    public String registroPage() {
        return "registro"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/inscribirse")
    public String inscribirsePage() {
        return "inscribirse"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/testimonios")
    public String testimoniosPage() {
        return "testimonios"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/requisitosAdopcion")
    public String requisitosAdopcionPage() {
        return "requisitosAdopcion"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/castraciones")
    public String castracionesPage() {
        return "castraciones"; // This should match about.html in src/main/resources/templates
    }
}
