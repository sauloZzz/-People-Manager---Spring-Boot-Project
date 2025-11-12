package com.example.internaldatabase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

}
