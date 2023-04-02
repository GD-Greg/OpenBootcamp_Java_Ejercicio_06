package ejercicios;

// Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayBidi[][] = new int[2][2];

        System.out.println("__--Creacion del Array Bidimensional--__");
        for (int i = 0; i < arrayBidi.length; i++){
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Digite el valor de: [" + i + "][" + j + "]");
                arrayBidi[i][j] = scanner.nextInt();
            }
        }

        System.out.println("__--Impresion del Array Bidimensional--__");
        for (int i = 0; i < arrayBidi.length; i++){
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("[" + i + "][" + j + "] = " + arrayBidi[i][j]);
            }
        }

    }
}
