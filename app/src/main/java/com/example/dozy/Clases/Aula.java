package com.example.dozy.Clases;

import java.util.HashMap;
import java.util.Map;

public class Aula {
    private String nombre;
    private String ubicacion;

    public Aula() {
    }

    public Aula(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("nombre", nombre);
        map.put("ubicacion", ubicacion);
        return map;
    }

    public static Aula fromMap(Map<String, Object> map) {
        return new Aula(
                (String) map.get("nombre"),
                (String) map.get("ubicacion")
        );
    }
}
