package com.agendaisic3602.Agenda.ISIC.TESJI2.servicio;

import com.agendaisic3602.Agenda.ISIC.TESJI2.modelo.AlumnoModel;

import java.util.ArrayList;
import java.util.Optional;

//Esta clase gestiona los metodos
public interface AgendaServicio {
    //EL ARRAYLIST ALAMCENA OBJETOS ENTEROS = JSON Y EL NORMAL ALMACENA DATOS PRIMITIVOS
    //ARRAYLIST TIENE UNA DIMENION DINAMICO, A EXEPCION DEL NORMAL
    ArrayList<AlumnoModel> devolverTodosAlumnos();
    Optional<AlumnoModel> devolverAlumnoId(long id);
    AlumnoModel insertAlumno(AlumnoModel alumno);
    boolean eliminarAlumno(long id);
}