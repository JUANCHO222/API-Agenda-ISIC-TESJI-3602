package com.agendaisic3602.Agenda.ISIC.TESJI2.repositorio;

import com.agendaisic3602.Agenda.ISIC.TESJI2.modelo.AlumnoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepositorio extends CrudRepository<AlumnoModel, Long> {
}
