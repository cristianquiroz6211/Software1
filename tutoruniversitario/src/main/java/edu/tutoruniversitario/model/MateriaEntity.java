package edu.tutoruniversitario.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "materias")
    public class MateriaEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;

        @Column(name = "id_carrera")
        private Long idCarrera;

        // Getters y setters
    }

