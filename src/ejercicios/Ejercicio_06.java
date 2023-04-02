package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los numeros pares.
 * Por último, vuelve a recorrerlo y muestra el ArrayList final.
 * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 */

public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite el tamaño del ArrayList: ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            lista.add(i);
        }

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) % 2 == 0) {
                lista.remove(i);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
