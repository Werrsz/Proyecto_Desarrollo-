package com.proyecto_D.controller;

import com.proyecto_D.domain.Cita;
import com.proyecto_D.domain.Usuario;
import com.proyecto_D.service.CitaService;
import com.proyecto_D.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//@RequestMapping("/listaMascotas")
@Controller
public class CitaController {

    @Autowired
    private CitaService citaService;

    @Autowired
    private UsuarioService usuarioService;
    
    @ModelAttribute("usuarioService")
    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    @GetMapping("/misCitas")
    public String misCitasPage(Model model, HttpSession session) {
        String nombre = (String) session.getAttribute("nombre");
        String correo = (String) session.getAttribute("correo");

        // false = 0 and 0 means Basic access
        boolean tipo_acceso = false;

        if (session.getAttribute("tipo_acceso") != null) {
            tipo_acceso = (boolean) session.getAttribute("tipo_acceso");
        }

        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("tipo_acceso", tipo_acceso);

        // Validar si el user es admin,
        // si lo es entonces tomamos todas las citas de el
        Usuario user = usuarioService.findByEmail(correo);
        model.addAttribute("user", user); 

        List<Cita> citas = null;

        if (user != null) {
            if (tipo_acceso) {
                // Quiere decir que el user SI es ADMIN
                citas = citaService.getCitasByDoctor(user.getId_usuario());

            } else {
                // Quiere decir que el user no es ADMIN
                citas = citaService.getCitasByUser(user.getId_usuario());
                
                // Crear objeto de cita con valores precargados
                var citaobject = new Cita();
                
                citaobject.setId_usuario(user.getId_usuario());
                
                model.addAttribute("cita", citaobject);
                
                // sacamos la lista de doctores
                
                var doctores = usuarioService.getAdminUsers();
                
                model.addAttribute("doctores", doctores);
            }
        }

        model.addAttribute("miscitas", citas);

        return "misCitas";
    }
    
    @PostMapping("/misCitas/submit")
    public String misCitasSubmit(Cita cita) {
        
        cita.setEstado("pendiente");
        
        citaService.save(cita);
        
        return "redirect:/misCitas";
    }
    
    @GetMapping("/misCitas/editar/{id_cita}")
    public String editarCita(@PathVariable("id_cita") long id_cita, Model model, HttpSession session){
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
        
        Cita cita = citaService.getCitaByID(id_cita);
        model.addAttribute("cita", cita);
        
        // Determinar usuario y agregarlo al model
        var id_usuario = cita.getId_usuario();
        Usuario user = usuarioService.getUsuarioByID(id_usuario);
        model.addAttribute("user", user); 
        
        // Determinar doctor y agregarlo al model
        var id_doctor = cita.getId_doctor();
        Usuario doctor = usuarioService.getUsuarioByID(id_doctor);
        
        model.addAttribute("doctor", doctor); 
        
        return "editarCita";
    }
    
    @PostMapping("/misCitas/editar/submit")
    public String editarCita_save(Cita cita) {
        citaService.save(cita);
        
        return "redirect:/misCitas";
    }
    
    
}
