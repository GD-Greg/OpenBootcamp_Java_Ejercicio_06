package ejercicios;

// Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

import java.util.Vector;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();

        /**
         * Los vectores poseen un array por debajo cuya capacidad por defecto es de 10 valores
         * Si creamos un array y le añadimos un par de valores:
         */
        for (int i = 0; i < 2; i++) {
            vector.add(i);
        }

        System.out.println("Tamaño del vector: " + vector.size());
        System.out.println("Capacidad del vector: " + vector.capacity());

        // Como vemos, la capacidad del vector es de 10 valores, entonces, ¿Qué pasaria si excedemos su capacidad?

        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        System.out.println();

        System.out.println("Tamaño del vector: " + vector.size());
        System.out.println("Capacidad del vector: " + vector.capacity());

        /**
         * En este caso excedimos la capacidad del array que esta por debajo del vector
         * y como resultado se creo un nuevo array cuya capacidad tambien es de 10, por ende el vector ahora es de tamaño 20
         * Si le añadieramos 1000 valores a un vector, se crearian 100 arreglos nuevos para aumentar el tamaño del
         * vector (en este caso serian 99 arrays nuevos ya que ya se creo uno nuevo para llegar a 20 en cuanto a tamaño del vector
         */
    }
}
