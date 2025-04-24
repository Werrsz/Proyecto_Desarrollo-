package com.proyecto_D.controller;

import com.proyecto_D.domain.Donacion;
import com.proyecto_D.domain.Necesidad;
import com.proyecto_D.domain.Usuario;
import com.proyecto_D.service.DonacionService;
import com.proyecto_D.service.NecesidadService;
import com.proyecto_D.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.proyecto_D.service.FirebaseStorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

//@RequestMapping("/listaMascotas")
@Controller
public class DonacionController {

    @Autowired
    private DonacionService donacionService;
    
    @Autowired
    private NecesidadService necesidadService;
    
    @Autowired
    private UsuarioService  usuarioService;
    
    @GetMapping("/donar/{id_necesidad}")
    public String donarNecesidad(@PathVariable("id_necesidad") long id_necesidad, Model model, HttpSession session){
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
        
        // Determinar la necesidad sobre la que se va donar
        Necesidad necesidad = necesidadService.getNecesidadByID(id_necesidad);
        model.addAttribute("necesidad", necesidad);
        
        // Determinar usuario y agregarlo al model
        Usuario user = usuarioService.getUsuarioByID(id_usuario);
        model.addAttribute("user", user);
        
        // creamos una donacion base
        Donacion donacion = new Donacion();
        
        donacion.setId_necesidad(id_necesidad);
        donacion.setId_usuario(id_usuario);
        donacion.setFecha(LocalDate.now().toString());
        
        model.addAttribute("donacion", donacion);
        
        return "donar";
    }
    
    @PostMapping("/donar/submit")
    public String donar_Save(Donacion donacion) {
        
        donacionService.save(donacion);
        
        // Actualizar la necesidad para reducir la cantidad necesitada
        Necesidad necesidad = necesidadService.getNecesidadByID(donacion.getId_necesidad());
        
        Long nuevaCatidad = necesidad.getCantidad() - donacion.getCantidad();
        
        necesidad.setCantidad(nuevaCatidad);
        
        // Si ya se alcanza la cantidad requerida en la necesidad, entonces se le cambia el estado
        if (nuevaCatidad < 1) {
            necesidad.setActiva(false);
        }
        
        necesidadService.save(necesidad);
        
        return "redirect:/necesidades";
    }
}
