package ejercicios;

// Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto;

        System.out.println("Digite una cadena de texto: ");
        texto = scanner.nextLine();

        System.out.println("Cadena digitada: " + texto);
        System.out.println("Caracteres: ");
        for(int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i) + " ");
        }
    }
}
