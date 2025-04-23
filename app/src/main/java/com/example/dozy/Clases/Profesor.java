package com.example.dozy.Clases;

import java.util.HashMap;
import java.util.Map;

public class Profesor {
    private String nombre;
    private String apellido;
    private String correo;
    public Profesor() {
    }
    public Profesor(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Convertir a Map para guardar en Firestore
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("nombre", nombre);
        map.put("apellido", apellido);
        map.put("correo", correo);
        return map;
    }

    // Crear Profesor desde un Map (por ejemplo, desde un DocumentSnapshot)
    public static Profesor fromMap(Map<String, Object> map) {
        return new Profesor(
                (String) map.get("nombre"),
                (String) map.get("apellido"),
                (String) map.get("correo")
        );
    }
}
