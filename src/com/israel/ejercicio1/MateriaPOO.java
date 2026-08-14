package com.israel.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MateriaPOO {
    private String nombreMateria;
    private List<Alumno> listaAlumnos;

    public MateriaPOO(String nombre) {
        this.nombreMateria = nombre;
        this.listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno nuevoAlumno) {
        listaAlumnos.add(nuevoAlumno);
        System.out.println("[INFO] Alumno añadido correctamente.");
    }

    public void mostrarAlumnos() {
        System.out.println("Lista de alumnos en " + nombreMateria + ":");
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno a : listaAlumnos) {
                System.out.println(a);
            }
        }
    }
}
