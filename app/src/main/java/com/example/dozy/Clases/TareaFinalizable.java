package com.example.dozy.Clases;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TareaFinalizable{
    private String uid;
    private String titulo;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaTermino;
    private Boolean finalizado;

    public TareaFinalizable() {
    }

    public TareaFinalizable(String uid, String titulo, String descripcion, Date fechaInicio, Date fechaTermino, Boolean finalizado) {
        this.uid = uid;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.finalizado = finalizado;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }
}