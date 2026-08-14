package com.israel.ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto que representará nuestra materia
        MateriaPOO curso2025 = new MateriaPOO("Programación Orientada a Objetos 2025");

        // Crear instancias individuales de cada alumno (Objetos)
        Alumno a1 = new Alumno("Israel Pérez", 101, 8.5);
        Alumno a2 = new Alumno("Juan Gómez", 102, 9.0);
        Alumno a3 = new Alumno("Ana García", 103, 7.5);

        // Agregarlos al curso (Interacción entre objetos)
        curso2025.agregarAlumno(a1);
        curso2025.agregarAlumno(a2);
        curso2025.agregarAlumno(a3);

        // Mostrar la lista final en consola
        System.out.println("--------------------------------------------------");
        curso2025.mostrarAlumnos();
        System.out.println("--------------------------------------------------");
    }
}
