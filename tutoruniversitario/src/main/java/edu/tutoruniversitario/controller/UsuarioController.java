package edu.tutoruniversitario.controller;


import edu.tutoruniversitario.model.LoginDto;
import edu.tutoruniversitario.model.Tutor;
import edu.tutoruniversitario.model.Estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginData) {
        Object usuario = usuarioService.obtenerUsuarioPorCorreo(loginData.getEmail());
        if (usuario != null) {
            if (usuario instanceof Tutor) {
                return ResponseEntity.ok(usuario);
            } else if (usuario instanceof Estudiante) {
                return ResponseEntity.ok(usuarioService.obtenerTutoresDisponibles());
            }
        }
        return ResponseEntity.status(401).body("Credenciales inválidas");
    }
}
