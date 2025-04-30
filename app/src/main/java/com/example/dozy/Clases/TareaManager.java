package com.example.dozy.Clases;

import java.util.ArrayList;
import java.util.List;

public class TareaManager {
    List<TareaFinalizable>listaTareas;

    public TareaManager() {}
    public TareaManager(List<TareaFinalizable> listaTareas) {
        this.listaTareas = new ArrayList<TareaFinalizable>();
    }

    public List<TareaFinalizable> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<TareaFinalizable> listaTareas) {
        this.listaTareas = new ArrayList<TareaFinalizable>();
    }

    public void agregarTarea(TareaFinalizable tarea){
        listaTareas.add(tarea);
    }
    public void eliminarTarea(TareaFinalizable tarea){
        listaTareas.remove(tarea);
    }
    public void obtenerTareas(){

    }
    public void finalizarTarea(){

    }

    public void editarTarea(){}
}
