package edu.tutoruniversitario.model;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    Estudiante findByEmail(String email);
}
