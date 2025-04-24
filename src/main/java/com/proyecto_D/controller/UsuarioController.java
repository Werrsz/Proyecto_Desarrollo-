
package com.proyecto_D.controller;

import com.proyecto_D.domain.Usuario;
import com.proyecto_D.service.UsuarioService;
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
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping("/login")
    public String login(Usuario usuario, Model model, HttpSession session) {
        
        var userExists = usuarioService.findByEmail(usuario.getCorreo());
        
        // Variable para manejar el estado de la transaccion
        // 0 No existe, 1 Success, 2 Password diferente
        var response = 0;
        
        // Si es nulo entonces no existe y lo intetamos registrar
        if (userExists != null) {
            
            var user = usuarioService.findByEmailAndPassword(usuario.getCorreo(), usuario.getContrasena());
            
            if(user != null){
                // Ambos datos coinciden
                response = 1;
                
                // Save the username info
                session.setAttribute("nombre", user.getNombre());
                session.setAttribute("correo", user.getCorreo());
                session.setAttribute("tipo_acceso", user.getTipo_acceso());
                session.setAttribute("id_usuario", user.getId_usuario());
              
            }else{
                // No coincide la contrasena
                response = 2;
            }
        }
        
        model.addAttribute("response", response);
        
        // Si el login salio bien, entonces redirige hacia el home page
        if(response == 1){
            return "redirect:/";
        }
        
        return "login";
    }
    
    @PostMapping("/registro")
    public String nuevoUsuario(Usuario usuario, Model model, HttpSession session) {
        
        var userExists = usuarioService.findByEmail(usuario.getCorreo());
        
        // Variable para manejar el estado de la transaccion
        // 0 Ya existe, 1 Success, 2 Error
        var response = 0;
        
        // Si es nulo entonces no existe y lo intetamos registrar
        if (userExists == null) {
            usuario.setTipo_acceso(false);
            usuarioService.save(usuario);
            
            // Validar si el usuario se creo, y ponerlo en la variable de control
            var nuevoUsuario = usuarioService.getUsuario(usuario);

            if(nuevoUsuario != null){
                // Lo pudo registrar bien
                response = 1;
                
                // Save the username info
                session.setAttribute("nombre", nuevoUsuario.getNombre());
                session.setAttribute("correo", nuevoUsuario.getCorreo());
                session.setAttribute("tipo_acceso", nuevoUsuario.getTipo_acceso());
                session.setAttribute("id_usuario", nuevoUsuario.getId_usuario());
              
            }else{
                // No fue regustrado
                response = 2;
            }
        }
        
        model.addAttribute("response", response);
        
        // Si el registro salio bien, entonces redirige hacia el home page
        if(response == 1){
            return "redirect:/";
        }
        
        return "registro";
    }

}