package com.example.dozy.Clases;

import java.util.ArrayList;
import java.util.List;

public class EventoManager {
    List<Evento> ListaEventos;

    public EventoManager() {}
    public EventoManager(List<Evento> listaEventos) {
        ListaEventos = new ArrayList<Evento>();
    }

    public List<Evento> getListaEventos() {
        return ListaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {
        ListaEventos = listaEventos;
    }

    public void obtenerEventos() {}
    public void agregarEvento(Evento nuevoEvento) {
        ListaEventos.add(nuevoEvento);
    }
    public void eliminarEvento(Evento evento){
        ListaEventos.remove(evento);
    }
    public void EditarEvento() {}

}
