package org.example.laboratoriouno;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sesion {
    private LocalDateTime fecha;
    private int duracion;
    private Enum<Estado> estadosesion;
    private Deporte /* no es mejor un String? */ deporte;
    private Entrenador entrenador;

    public Sesion(LocalDateTime fecha, int duracion, Enum<Estado> estadosesion, Deporte deporte, Entrenador entrenador) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.estadosesion = estadosesion;
        this.deporte = deporte;
        this.entrenador = entrenador;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Enum<Estado> getEstadosesion() {
        return estadosesion;
    }

    public void setEstadosesion(Enum<Estado> estadosesion) {
        this.estadosesion = estadosesion;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    private static ArrayList<>
}
