/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/RestController.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entidad.Persona;
import com.example.demo.servicio.ServicioPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DELL
 */
@RestController
@RequestMapping("/api/persona")
@CrossOrigin(origins = "*")
public class ApiPersona {
    @Autowired
    ServicioPersona servicio;

    @GetMapping("/all")
    public List<Persona> findAllPesonas() {
        return servicio.getPersonas();        
    }
}
