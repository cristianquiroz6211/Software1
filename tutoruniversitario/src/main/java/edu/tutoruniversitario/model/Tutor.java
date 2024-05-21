package edu.tutoruniversitario.model;
import jakarta.persistence.*;
import lombok.Data;


import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "tutores")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String correo;
    private String institucionEducativa;

    @Column(name = "id_carrera")
    private Long idCarrera;

    private String descripcion;
    private String experiencia;

    @ManyToMany
    @JoinTable(
            name = "tutor_materia",
            joinColumns = @JoinColumn(name = "id_tutor"),
            inverseJoinColumns = @JoinColumn(name = "id_materia")
    )
    private Set<MateriaEntity> materias = new HashSet<>();
}