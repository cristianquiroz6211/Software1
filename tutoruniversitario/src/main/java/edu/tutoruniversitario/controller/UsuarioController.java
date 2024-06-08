package edu.tutoruniversitario.controller;


import edu.tutoruniversitario.model.LoginDto;
import edu.tutoruniversitario.model.Tutor;
import edu.tutoruniversitario.model.Estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//


@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginData) {
        Object usuario = usuarioService.obtenerUsuarioPorCorreo(loginData.getEmail());
        if (usuario != null) {
            Map<String, Object> response = new HashMap<>();
            if (usuario instanceof Tutor) {
                response.put("role", "tutor");
                response.put("data", usuario);
            } else if (usuario instanceof Estudiante) {
                response.put("role", "estudiante");
                response.put("data", usuarioService.obtenerTutoresDisponibles());
            }
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(401).body("Credenciales inválidas");
    }
}
