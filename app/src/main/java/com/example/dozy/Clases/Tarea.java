package com.example.dozy.Clases;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tarea {
    private String uid;
    private String titulo;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaTermino;
    private boolean finalizada;

    public Tarea() {
    }
    public Tarea(String uid, String titulo, String descripcion, Date fechaInicio, Date fechaTermino, boolean finalizada) {
        this.uid = uid;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.finalizada = finalizada;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String id) {
        this.uid = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    // Metodo para crear una Tarea desde un Map
    public Map<String, Object> toMap() {
        Map<String, Object> tareaMap = new HashMap<>();
        tareaMap.put("titulo", titulo);
        tareaMap.put("descripcion", descripcion);
        tareaMap.put("fechaInicio", fechaInicio);
        tareaMap.put("fechaTermino", fechaTermino);
        tareaMap.put("finalizada", finalizada);
        return tareaMap;
    }
}
