package com.agendaisic3602.Agenda.ISIC.TESJI2.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//con Entity la clase se convierte en una tabla
@Entity
public class AlumnoModel {
    @Id //Con esta notacion el atributo se convierte en primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrementable
    private long id; //Campo llave
    private String nombre;
    private String domicilio;
    private String correo;
    private String telefono;

    //Inicializar un constructor

    public AlumnoModel() {
    }

    public AlumnoModel(String nombre, String domicilio, String correo, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
    }

    public AlumnoModel(long id, String nombre, String domicilio, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
    }
//get toma valor y setter asigna
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
