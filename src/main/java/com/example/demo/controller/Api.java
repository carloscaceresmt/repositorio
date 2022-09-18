/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/RestController.java to edit this template
 */
package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DELL
 */
@RestController
@RequestMapping("/api")
public class Api {

    @GetMapping("/saludo")
    public String getpeticion() {
        return "Hola";
    }

    @GetMapping("/ver")
    public ResponseEntity getVer() {
        Persona persona = new Persona("carlos", "caceres", "GET");
        return ResponseEntity.status(201).body(persona);
    }

    @PostMapping("/ver")
    public ResponseEntity postVer(@RequestBody Persona persona) {
        return ResponseEntity.status(201).body(persona);
    }

    @PutMapping("/ver")
    public ResponseEntity putVer() {
        Persona persona = new Persona("carlos", "caceres", "PUT");
        return ResponseEntity.status(201).body(persona);
    }

    @DeleteMapping("/ver/{nombre}/{apellido}/{peticion}")
    public ResponseEntity deleteVer(@PathVariable String nombre,
                                    @PathVariable String apellido,
                                    @PathVariable String peticion) {
        Persona persona = new Persona(nombre, apellido, peticion);
        if(apellido.equals("") | apellido==null){
            System.out.println("entro a apellido");
        }
        System.out.println(persona.toString());
        return ResponseEntity.status(204).body(persona);
    }
}
