package com.agendaisic3602.Agenda.ISIC.TESJI2.servicio;

import com.agendaisic3602.Agenda.ISIC.TESJI2.modelo.AlumnoModel;
import com.agendaisic3602.Agenda.ISIC.TESJI2.repositorio.AgendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service //Exponemos esas clases el controlador conecta el modelo
public class AgendaServicioImplementar implements AgendaServicio{
    @Autowired
    AgendaRepositorio agendaRepositorio; //Tiene operaciojes crud

    @Override
    public ArrayList<AlumnoModel> devolverTodosAlumnos() {
        return (ArrayList<AlumnoModel>) agendaRepositorio.findAll();
    }

    @Override
    public Optional<AlumnoModel> devolverAlumnoId(long id) {
        return agendaRepositorio.findById(id);
    }

    @Override
    public AlumnoModel insertAlumno(AlumnoModel alumno) {
        return agendaRepositorio.save(alumno);
    }

    @Override
    public boolean eliminarAlumno(long id) {
        return false;
    }
}
