package edu.tutoruniversitario.repository;

import edu.tutoruniversitario.model.Tutor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
}