package com.proyecto_D.controller;

import com.proyecto_D.domain.Necesidad;
import com.proyecto_D.service.NecesidadService;
import jakarta.servlet.http.HttpSession;
import java.util.List;
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
public class NecesidadController {

    @Autowired
    private NecesidadService necesidadService;

    @GetMapping("/necesidades")
    public String necesidadesPage(Model model, HttpSession session) {
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

        // Cargamos la lista de necesidades
        List<Necesidad> necesidades = necesidadService.getNecesidades();

        model.addAttribute("necesidades", necesidades);

        return "necesidades"; // This should match about.html in src/main/resources/templates
    }

    @PostMapping("/necesidades/submit")
    public String necesidadSubmit(Necesidad necesidad) {

        // Setear estado como activo por defecto
        necesidad.setActiva(true);

        necesidadService.save(necesidad);

        return "redirect:/necesidades";
    }

    @GetMapping("/eliminarNecesidad/{id_necesidad}")
    public String eliminarNecesidad(@PathVariable("id_necesidad") long id_necesidad) {
        necesidadService.deleteByID(id_necesidad);

        return "redirect:/necesidades";
    }

}
