package com.agendaisic3602.Agenda.ISIC.TESJI2.controlador;

import com.agendaisic3602.Agenda.ISIC.TESJI2.modelo.AlumnoModel;
import com.agendaisic3602.Agenda.ISIC.TESJI2.repositorio.AgendaRepositorio;
import com.agendaisic3602.Agenda.ISIC.TESJI2.servicio.AgendaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

//Usamos anotaciones
@RestController //Con esta anotacion expone la clase como una API REST
@RequestMapping("api-isic-tesji") //Para asignarle una ruta principal de acceso a la API
public class ApiAgenda3602 {
    @Autowired
    AgendaServicio agendaServicio;
    @GetMapping("prueba")// PAARA ASIGNAR UNA URL lo guardamos en un getMapping recordemos que get es para leer
     public String prebaGet(){
         return "Hola mundo desde Spring, mi primera API";
        }
    @GetMapping("/mostrar-alumnos")
    public ArrayList<AlumnoModel> getMostrarAlumnos(){
        return agendaServicio.devolverTodosAlumnos();
     }
     @PostMapping("/guardar-alumno")
    public AlumnoModel postGuardarAlumno(@RequestBody AlumnoModel alumno){
        return agendaServicio.insertAlumno(alumno);
     }
     //Requestbody evnia una peticion
    @GetMapping("/mostrar-alumno-{id}")
    public Optional<AlumnoModel> getMostrarAlumno(@PathVariable("id") long id){
        return agendaServicio.devolverAlumnoId(id);
    }

}
