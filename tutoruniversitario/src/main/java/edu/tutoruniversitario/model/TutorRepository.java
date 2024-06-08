package edu.tutoruniversitario.model;

import org.springframework.data.jpa.repository.JpaRepository;



public interface TutorRepository extends JpaRepository<Tutor, Integer> {
    Tutor findByEmail(String email);
}
