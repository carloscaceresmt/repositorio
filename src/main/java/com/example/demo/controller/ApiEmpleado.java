/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/RestController.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entidad.Matricula;
import com.example.demo.servicio.ServicioMatricula;
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
@RequestMapping("/api/matricula")
@CrossOrigin(origins = "*")
public class ApiEmpleado {
    @Autowired
    private ServicioMatricula servicio;

    @GetMapping("/ver")
    public Matricula findAllPesonas() {
        return servicio.getEstudiante();        
    }
}
