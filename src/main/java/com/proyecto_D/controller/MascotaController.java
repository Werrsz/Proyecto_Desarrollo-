
package com.proyecto_D.controller;

import com.proyecto_D.domain.Mascota;
import com.proyecto_D.service.MascotaService;
import jakarta.servlet.http.HttpSession;
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


@Controller
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping("/listaMascotas")
    public String listado(Model model, HttpSession session) {
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
        
        var mascotas = mascotaService.getMascotas();
        model.addAttribute("mascotas", mascotas);
        model.addAttribute("totalMascotas", mascotas.size());
        return "listaMascotas";
    }
    
    @PostMapping("/guardarMascota")
    public String guardarMascota(Mascota mascota) {
        // Set a default status
        mascota.setEstado("disponible");
        mascotaService.save(mascota);
        
        return "redirect:/listaMascotas";
    }
    
    @GetMapping("/editarMascota/{id_mascota}")
    public String editarMascota(@PathVariable("id_mascota") long id_mascota, Model model, HttpSession session){
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
        
        var mascota = mascotaService.getMascotaById(id_mascota);
        model.addAttribute("mascota", mascota);
        return "editarMascota";
    }
    
    @PostMapping("/editarMascota/submit")
    public String editarMascota_save(Mascota mascota) {
        mascotaService.save(mascota);
        
        return "redirect:/listaMascotas";
    }
    
    @GetMapping("/eliminarMascota/{id_mascota}")
    public String eliminarMascota(@PathVariable("id_mascota") long id_mascota) {
        mascotaService.deleteByID(id_mascota);
        
        return "redirect:/listaMascotas";
    }

//    @Autowired
//    private FirebaseStorageService firebaseStorageService;
//
//    @PostMapping("/guardar")
//    public String usuarioGuardar(Usuario usuario,
//            @RequestParam("imagenFile") MultipartFile imagenFile) {
//        if (!imagenFile.isEmpty()) {
//            usuarioService.save(usuario,false);
//            usuario.setRutaImagen(
//                    firebaseStorageService.cargaImagen(
//                            imagenFile,
//                            "usuario",
//                            usuario.getIdUsuario()));
//        }
//        usuarioService.save(usuario,true);
//        return "redirect:/usuario/listado";
//    }
    
    /*

    @GetMapping("/eliminar/{idUsuario}")
    public String usuarioEliminar(Mascota usuario) {
        mascotaService.delete(usuario);
        return "redirect:/usuario/listado";
    }

    @GetMapping("/modificar/{idUsuario}")
    public String usuarioModificar(Mascota usuario, Model model) {
        usuario = mascotaService.getUsuario(usuario);
        model.addAttribute("usuario", usuario);
        return "/usuario/modifica";
    }
    */
}