package com.israel.ejercicios;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bienvenidos a POO 2025 ===");
        
        // Ejemplo de uso de otra clase en el mismo paquete
        Matematica calc = new Matematica();
        int suma = calc.sumar(5, 10);
        System.out.println("Resultado de la suma: " + suma);

        // Ejemplo de creación de un objeto Persona
        Persona p1 = new Persona("Israel", 25);
        p1.saludar();
    }
}
