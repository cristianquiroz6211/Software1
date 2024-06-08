package edu.tutoruniversitario.controller;



import edu.tutoruniversitario.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerEstudiante(@PathVariable int id) {
        Estudiante estudiante = usuarioService.obtenerEstudiantePorId(id);
        if (estudiante != null) {
            return ResponseEntity.ok(estudiante);
        }
        return ResponseEntity.status(404).body("Estudiante no encontrado");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarEstudiante(@PathVariable int id, @RequestBody Estudiante estudianteActualizado) {
        Estudiante estudiante = usuarioService.obtenerEstudiantePorId(id);
        if (estudiante != null) {
            estudiante.setNombre(estudianteActualizado.getNombre());
            estudiante.setApellido(estudianteActualizado.getApellido());
            estudiante.setEmail(estudianteActualizado.getEmail());
            usuarioService.actualizarEstudiante(estudiante);
            return ResponseEntity.ok(estudiante);
        }
        return ResponseEntity.status(404).body("Estudiante no encontrado");
    }

    @GetMapping("/tutores")
    public ResponseEntity<?> obtenerTutoresDisponibles() {
        return ResponseEntity.ok(usuarioService.obtenerTutoresDisponibles());
    }
}
