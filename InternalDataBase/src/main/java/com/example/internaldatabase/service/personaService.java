package com.example.internaldatabase.service;
import com.example.internaldatabase.model.persona;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service

public class personaService {
    private final List<persona> personas = new ArrayList<>();

    public void agregarPersona(persona p){
        personas.add(p);
    }

    public List<persona> obtenerPersonas() {
        return personas;
    }



}
