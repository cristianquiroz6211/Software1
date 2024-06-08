package edu.tutoruniversitario.controller;


import edu.tutoruniversitario.model.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//


@RestController
@RequestMapping("/api/tutores")
public class TutorController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerTutor(@PathVariable int id) {
        Tutor tutor = usuarioService.obtenerTutorPorId(id);
        if (tutor != null) {
            return ResponseEntity.ok(tutor);
        }
        return ResponseEntity.status(404).body("Tutor no encontrado");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarTutor(@PathVariable int id, @RequestBody Tutor tutorActualizado) {
        Tutor tutor = usuarioService.obtenerTutorPorId(id);
        if (tutor != null) {
            tutor.setNombre(tutorActualizado.getNombre());
            tutor.setApellido(tutorActualizado.getApellido());
            tutor.setEmail(tutorActualizado.getEmail());
            tutor.setTelefono(tutorActualizado.getTelefono());
            tutor.setDescripcion(tutorActualizado.getDescripcion());
            tutor.setHorariosDisponibles(tutorActualizado.getHorariosDisponibles());
            usuarioService.actualizarTutor(tutor);
            return ResponseEntity.ok(tutor);
        }
        return ResponseEntity.status(404).body("Tutor no encontrado");
    }
}
