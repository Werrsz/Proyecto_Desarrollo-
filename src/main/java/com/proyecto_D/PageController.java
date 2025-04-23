/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto_D;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author valer
 */
@Controller
public class PageController {
    @GetMapping("/")
    public String homePage(Model model, HttpSession session) {
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
        
        return "about"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/about")
    public String aboutPage(Model model, HttpSession session) {
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
        
        return "about"; // This should match about.html in src/main/resources/templates
    }
    
//    @GetMapping("/listaMascotas")
//    public String listaMascotasPage() {
//        return "listaMascotas"; // This should match about.html in src/main/resources/templates
//    }
    
    @GetMapping("/necesidades")
    public String necesidadesPage(Model model, HttpSession session) {
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
        
        return "necesidades"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/login")
    public String loginPage(Model model, HttpSession session) {
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
        
        return "login"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/logout")
    public String logoutPage(HttpSession session) {
        session.removeAttribute("nombre");
        session.removeAttribute("correo");
        session.removeAttribute("tipo_acceso");
        
        return "about"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/registro")
    public String registroPage(Model model, HttpSession session) {
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
        
        return "registro"; // This should match about.html in src/main/resources/templates
    }
    
//    @GetMapping("/inscribirse")
//    public String inscribirsePage(Model model, HttpSession session) {
//        String nombre = (String) session.getAttribute("nombre");
//        String correo = (String) session.getAttribute("correo");
//        
//        // false = 0 and 0 means Basic access
//        boolean tipo_acceso = false;
//                
//        if(session.getAttribute("tipo_acceso") != null){
//            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
//        }
//        
//        model.addAttribute("nombre", nombre);
//        model.addAttribute("correo", correo);
//        model.addAttribute("tipo_acceso", tipo_acceso);
//        
//        return "inscribirse"; // This should match about.html in src/main/resources/templates
//    }
    
//    @GetMapping("/testimonios")
//    public String testimoniosPage(Model model, HttpSession session) {
//        String nombre = (String) session.getAttribute("nombre");
//        String correo = (String) session.getAttribute("correo");
//        
//        // false = 0 and 0 means Basic access
//        boolean tipo_acceso = false;
//                
//        if(session.getAttribute("tipo_acceso") != null){
//            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
//        }
//        
//        model.addAttribute("nombre", nombre);
//        model.addAttribute("correo", correo);
//        model.addAttribute("tipo_acceso", tipo_acceso);
//        
//        return "testimonios"; // This should match about.html in src/main/resources/templates
//    }
    
    @GetMapping("/requisitosAdopcion")
    public String requisitosAdopcionPage(Model model, HttpSession session) {
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
        
        return "requisitosAdopcion"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/castraciones")
    public String castracionesPage(Model model, HttpSession session) {
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
        
        return "castraciones"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/historiaMascota")
    public String historiaMascotaPage(Model model, HttpSession session) {
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
        
        return "historiaMascota"; // This should match about.html in src/main/resources/templates
    }

    @GetMapping("/verAdopciones")
    public String verAdopcionesPage(Model model, HttpSession session) {
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
        
        return "verAdopciones"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/castracionesLista")
    public String castracionesListaPage(Model model, HttpSession session) {
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
        
        return "castracionesLista";
    }
    
    @GetMapping("/agregarMascota")
    public String agregarMascotaPage(Model model, HttpSession session) {
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
        
        return "agregarMascota";
    }
    
    /*
    @GetMapping("/editarMascota")
    public String editarMascotaPage(Model model, HttpSession session) {
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
    
        return "editarMascota";
    }
    */
    
//    @GetMapping("/misCitas")
//    public String misCitasPage(Model model, HttpSession session) {
//        String nombre = (String) session.getAttribute("nombre");
//        String correo = (String) session.getAttribute("correo");
//        
//        // false = 0 and 0 means Basic access
//        boolean tipo_acceso = false;
//                
//        if(session.getAttribute("tipo_acceso") != null){
//            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
//        }
//        
//        model.addAttribute("nombre", nombre);
//        model.addAttribute("correo", correo);
//        model.addAttribute("tipo_acceso", tipo_acceso);
//        
//        return "misCitas";
//    }
}
