package com.proyecto_D.controller;

import com.proyecto_D.domain.Usuario;
import com.proyecto_D.service.UsuarioService;
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
public class CitaController {

    @Autowired
    private UsuarioService usuarioService;

    /*

    @GetMapping("/citas")
    public String listado(Model model) {
        var usuarios = usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("totalUsuarios", usuarios.size());
        return "/listaMascotas";
    }

    @GetMapping("/nuevo")
    public String usuarioNuevo(Usuario usuario) {
        return "/usuario/modifica";
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

    @GetMapping("/eliminar/{idUsuario}")
    public String usuarioEliminar(Usuario usuario) {
        usuarioService.delete(usuario);
        return "redirect:/usuario/listado";
    }

    @GetMapping("/modificar/{idUsuario}")
    public String usuarioModificar(Usuario usuario, Model model) {
        usuario = usuarioService.getUsuario(usuario);
        model.addAttribute("usuario", usuario);
        return "/usuario/modifica";
    }
     */
}
