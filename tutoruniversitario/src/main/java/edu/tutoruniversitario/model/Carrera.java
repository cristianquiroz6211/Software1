package edu.tutoruniversitario.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;


import java.util.List;



import java.util.List;

@Entity
@Table(name = "carreras")
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre_carrera", nullable = false)
    private String nombreCarrera;

    @OneToMany(mappedBy = "carrera")
    @JsonManagedReference
    private List<Tutor> tutores;

    @OneToMany(mappedBy = "carrera")
    private List<Estudiante> estudiantes;

    // Constructor, getters y setters
    public Carrera() {}

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Carrera setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
        return this;
    }

    public int getId() {
        return id;
    }

    public Carrera setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public Carrera setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
        return this;
    }

    public List<Tutor> getTutores() {
        return tutores;
    }

    public Carrera setTutores(List<Tutor> tutores) {
        this.tutores = tutores;
        return this;
    }
}
