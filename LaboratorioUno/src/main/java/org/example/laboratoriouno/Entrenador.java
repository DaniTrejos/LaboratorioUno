package org.example.laboratoriouno;

import java.util.ArrayList;

public class Entrenador {
    private String nombre;
    private String especialidad;
    private ArrayList<String> listaSesiones;

    public Entrenador(String nombre, String especialidad, ArrayList<String> listaSesiones) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.listaSesiones = listaSesiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<String> getListaSesiones() {
        return listaSesiones;
    }

    public void setListaSesiones(ArrayList<String> listaSesiones) {
        this.listaSesiones = listaSesiones;
    }
}
