/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.servicio;

import com.example.demo.entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
/**
 * clase de servicio para datos de persona
 * @author DELL
 */
@Service
public class ServicioPersona {
    
    /**
     * metodo que lista todas las personas con datos quemados  
     * @return List<Persona>
     */
    public List<Persona> getPersonas(){
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan","Perez"));
        personas.add(new Persona("Manuel","Gonzalez"));
        personas.add(new Persona("Daniel","Bitar"));
        personas.add(new Persona("Jose","Pimienta"));
        personas.add(new Persona("Nelson","Badel"));
        personas.add(new Persona("Sebastian","hernandez"));
        return personas;
    }
}
