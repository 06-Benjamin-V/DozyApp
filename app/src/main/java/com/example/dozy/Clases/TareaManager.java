package com.example.dozy.Clases;

import android.nfc.Tag;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TareaManager {
   private List<TareaFinalizable>listaTareas;
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

    public void agregarTarea(TareaFinalizable tarea, FirebaseFirestore db) {
        listaTareas.add(tarea);
        db.collection("Task")
                .add(tarea.TareaFinalizableToMap());
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
