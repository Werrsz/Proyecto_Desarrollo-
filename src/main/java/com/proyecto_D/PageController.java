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
        Long id_usuario = (Long) session.getAttribute("id_usuario");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        return "about"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/about")
    public String aboutPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        Long id_usuario = (Long) session.getAttribute("id_usuario");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        return "about"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/login")
    public String loginPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        Long id_usuario = (Long) session.getAttribute("id_usuario");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        return "login"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/logout")
    public String logoutPage(HttpSession session) {
        session.removeAttribute("nombre");
        session.removeAttribute("correo");
        session.removeAttribute("tipo_acceso");
        session.removeAttribute("id_usuario");
        
        return "about"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/registro")
    public String registroPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        Long id_usuario = (Long) session.getAttribute("id_usuario");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        return "registro"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/requisitosAdopcion")
    public String requisitosAdopcionPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        Long id_usuario = (Long) session.getAttribute("id_usuario");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        return "requisitosAdopcion"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/castraciones")
    public String castracionesPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        Long id_usuario = (Long) session.getAttribute("id_usuario");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        return "castraciones"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/historiaMascota")
    public String historiaMascotaPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        Long id_usuario = (Long) session.getAttribute("id_usuario");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        return "historiaMascota"; // This should match about.html in src/main/resources/templates
    }
    
    @GetMapping("/castracionesLista")
    public String castracionesListaPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        Long id_usuario = (Long) session.getAttribute("id_usuario");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        return "castracionesLista";
    }
    
    @GetMapping("/agregarMascota")
    public String agregarMascotaPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        Long id_usuario = (Long) session.getAttribute("id_usuario");
        
        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;
                
        if(session.getAttribute("tipo_acceso") != null){
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        return "agregarMascota";
    }
    
    
}
