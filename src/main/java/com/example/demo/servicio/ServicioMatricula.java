/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.servicio;

import com.example.demo.entidad.Asignatura;
import com.example.demo.entidad.Estudiante;
import com.example.demo.entidad.Matricula;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class ServicioMatricula {
    @Autowired
    Estudiante estudiante;
    @Autowired
    private Matricula matricula;
    
    public Matricula getEstudiante(){
        List<Asignatura> asignaturas = new ArrayList<>();
        LocalDate hoy = LocalDate.now();
        asignaturas.add(new Asignatura("11","Base de datos","3"));
        asignaturas.add(new Asignatura("12","Ingenieria de Software","3"));
        asignaturas.add(new Asignatura("13","Seminario de Actualizacion","2"));
     //   asignaturas.add(new Asignatura("14","Automatas","3"));        
        estudiante.setCodigo("11111");
        estudiante.setNombres("Juan");
        estudiante.setApellido("Perez");   
        matricula.setCodMatricula("h666777111");
        matricula.setFechaMatricula(hoy);
        matricula.setAsignatura(asignaturas);
        matricula.setEstudiante(estudiante); 
        matricula.setNumAsigMatriculada(asignaturas.size());
        return matricula;
    }
    
    
}
