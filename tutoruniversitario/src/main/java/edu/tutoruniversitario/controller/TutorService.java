package edu.tutoruniversitario.controller;

import edu.tutoruniversitario.model.Tutor;
import edu.tutoruniversitario.repository.TutorRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    // Métodos del servicio
    public Tutor crearTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public Tutor obtenerTutorPorId(Long id) {
        return tutorRepository.findById(id).orElse(null);
    }

    public List<Tutor> obtenerTodosTutores() {
        return tutorRepository.findAll();
    }

    public Tutor actualizarTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public void eliminarTutor(Long id) {
        tutorRepository.deleteById(id);
    }
}