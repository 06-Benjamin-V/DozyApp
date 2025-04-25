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
    public Tarea() {
    }
    public Tarea(String uid, String titulo, String descripcion, Date fechaInicio, Date fechaTermino) {
        this.uid = uid;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }
}
