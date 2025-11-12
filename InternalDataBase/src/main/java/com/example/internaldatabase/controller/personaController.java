package com.example.internaldatabase.controller;

import com.example.internaldatabase.model.persona;
import com.example.internaldatabase.service.personaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller

public class personaController {
    @Autowired

    private personaService personaService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("persona", new persona());
        return "index";
    }

    @PostMapping("/agregar")
    public String agregarPersona(@ModelAttribute persona p){
        personaService.agregarPersona(p);
        return "redirect:/lista";
    }

    @GetMapping("/lista")
    public String listarPersonas(Model model) {
        System.out.println("🔹 Entró al método listarPersonas()");
        model.addAttribute("personas", personaService.obtenerPersonas());
        return "lista";
    }



}
