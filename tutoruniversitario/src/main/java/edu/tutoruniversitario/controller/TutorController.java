package edu.tutoruniversitario.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import edu.tutoruniversitario.model.Tutor;

import java.util.List;

@RestController
@RequestMapping("/api/tutores")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @PostMapping
    public ResponseEntity<Tutor> crearTutor(@RequestBody Tutor tutor) {
        Tutor tutorCreado = tutorService.crearTutor(tutor);
        return ResponseEntity.status(HttpStatus.CREATED).body(tutorCreado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tutor> obtenerTutorPorId(@PathVariable Long id) {
        Tutor tutor = tutorService.obtenerTutorPorId(id);
        return ResponseEntity.ok(tutor);
    }

    @GetMapping
    public ResponseEntity<List<Tutor>> obtenerTodosTutores() {
        List<Tutor> tutores = tutorService.obtenerTodosTutores();
        return ResponseEntity.ok(tutores);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tutor> actualizarTutor(@PathVariable Long id, @RequestBody Tutor tutor) {
        tutor.setId(id);
        Tutor tutorActualizado = tutorService.actualizarTutor(tutor);
        return ResponseEntity.ok(tutorActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTutor(@PathVariable Long id) {
        tutorService.eliminarTutor(id);
        return ResponseEntity.noContent().build();
    }
}