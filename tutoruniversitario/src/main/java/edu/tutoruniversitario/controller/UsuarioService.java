package edu.tutoruniversitario.controller;

import edu.tutoruniversitario.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//


@Service
public class UsuarioService {

    @Autowired
    private TutorRepository tutorRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;

    public Object obtenerUsuarioPorCorreo(String correo) {
        Tutor tutor = tutorRepository.findByEmail(correo);
        if (tutor != null) {
            return tutor;
        }
        Estudiante estudiante = estudianteRepository.findByEmail(correo);
        return estudiante;
    }

    public List<Tutor> obtenerTutoresDisponibles() {
        return tutorRepository.findAll();
    }

    public Tutor obtenerTutorPorId(int id) {
        return tutorRepository.findById(id).orElse(null);
    }

    public Estudiante obtenerEstudiantePorId(int id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    public void actualizarTutor(Tutor tutor) {
        tutorRepository.save(tutor);
    }

    public void actualizarEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }
}
