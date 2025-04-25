package com.example.dozy.Clases;

import java.util.Date;

public class TareaFinalizable extends Tarea{
    private Boolean finalizado;

    public TareaFinalizable() {
    }

    public TareaFinalizable(String uid, String titulo, String descripcion, Date fechaInicio, Date fechaTermino, Boolean finalizado) {
        super(uid, titulo, descripcion, fechaInicio, fechaTermino);
        this.finalizado = finalizado;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }
}