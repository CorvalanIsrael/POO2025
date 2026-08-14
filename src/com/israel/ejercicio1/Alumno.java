package com.israel.ejercicio1;

public class Alumno {
    private String nombre;
    private int registro;
    private double promedio;

    public Alumno(String nombre, int registro, double promedio) {
        this.nombre = nombre;
        this.registro = registro;
        this.promedio = promedio;
    }

    // Método para obtener los datos básicos formateados
    @Override
    public String toString() {
        return "Registro: " + registro + " | Nombre: " + nombre + " | Promedio: " + promedio;
    }
}
