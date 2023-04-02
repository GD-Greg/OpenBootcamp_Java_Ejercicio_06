package ejercicios;

// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

import java.util.Vector;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector(128);
        vector.add("Hola Mundo");
        vector.add("Adios Mundo");
        vector.add("Buenos dias");
        vector.add("Buenas tardes");
        vector.add("Buenas noches");

        System.out.println("__--Mostrando datos--__");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Valor en el vector: " + vector.get(i));
        }

        System.out.println();
        vector.remove(2);
        vector.remove(3);

        System.out.println("__--Datos Modificados--__");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Valor en el vector: " + vector.get(i));
        }
    }
}
