package edu.tutoruniversitario.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;



@Entity
@Table(name = "tutores")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "horarios_disponibles")
    private String horariosDisponibles;

    @ManyToOne
    @JoinColumn(name = "carrera_id", referencedColumnName = "id")
    @JsonBackReference
    private Carrera carrera;

    // Constructor, getters y setters
    public Tutor() {}

    public String getApellido() {
        return apellido;
    }

    public Tutor setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public Tutor setCarrera(Carrera carrera) {
        this.carrera = carrera;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Tutor setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Tutor setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public Tutor setHorariosDisponibles(String horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
        return this;
    }

    public int getId() {
        return id;
    }

    public Tutor setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Tutor setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Tutor setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }
}
