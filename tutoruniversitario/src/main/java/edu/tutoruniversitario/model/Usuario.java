package edu.tutoruniversitario.model;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String tipoUsuario; // "estudiante" o "tutor"

    public String getCorreo() {
        return correo;
    }

    public Usuario setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public int getId() {
        return id;
    }

    public Usuario setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public Usuario setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        return this;
    }
// Constructor, getters y setters
}


