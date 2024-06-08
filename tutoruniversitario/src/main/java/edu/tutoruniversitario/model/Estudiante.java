package edu.tutoruniversitario.model;



import jakarta.persistence.*;





@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "carrera_id", referencedColumnName = "id")
    private Carrera carrera;

    // Constructor, getters y setters
    public Estudiante() {}

    public String getApellido() {
        return apellido;
    }

    public Estudiante setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public Estudiante setCarrera(Carrera carrera) {
        this.carrera = carrera;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Estudiante setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getId() {
        return id;
    }

    public Estudiante setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}
