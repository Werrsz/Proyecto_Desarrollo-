package com.proyecto_D.controller;

import com.proyecto_D.domain.Adopcion;
import com.proyecto_D.domain.Mascota;
import com.proyecto_D.service.AdopcionService;
import com.proyecto_D.service.MascotaService;
import com.proyecto_D.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdopcionController {

    @Autowired
    private AdopcionService adopcionService;

    @Autowired
    private MascotaService mascotaService;
    
    @Autowired
    private UsuarioService usuarioService;
    
    @ModelAttribute("adopcionService")
    public AdopcionService getAdopcionService() {
        return adopcionService;
    }
    
    @ModelAttribute("usuarioService")
    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    @GetMapping("/adoptarMascota/{id_mascota}")
    public String adoptarMascota(@PathVariable("id_mascota") long id_mascota, Model model, HttpSession session) {

        Long id_usuario = (Long) session.getAttribute("id_usuario");

        // Seteamos valores default de la adopcion
        Adopcion adopcion = new Adopcion();
        adopcion.setId_mascota(id_mascota);
        adopcion.setId_usuario(id_usuario);
        adopcion.setFecha_adopcion(LocalDate.now().toString());

        // Guardamos la adopcion
        adopcionService.save(adopcion);

        // Actualizamos la mascota para ponerla como NO disponible
        Mascota mascota = mascotaService.getMascotaById(id_mascota);

        mascota.setEstado("adoptado");
        mascotaService.save(mascota);

        return "redirect:/listaMascotas";
    }

    @GetMapping("/verAdopciones")
    public String verAdopcionesPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");
        Long id_usuario = (Long) session.getAttribute("id_usuario");

        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;

        if (session.getAttribute("tipo_acceso") != null) {
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }

        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);
        model.addAttribute("id_usuario", id_usuario);
        
        var mascotas = mascotaService.getMascotas();
        model.addAttribute("mascotas", mascotas);
        model.addAttribute("totalMascotas", mascotas.size());

        return "verAdopciones"; // This should match about.html in src/main/resources/templates
    }

}
