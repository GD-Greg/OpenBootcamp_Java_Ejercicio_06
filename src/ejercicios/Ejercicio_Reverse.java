package ejercicios;

import java.util.Scanner;

// Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

public class Ejercicio_Reverse {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        System.out.println("Digite una cadena de texto: ");
        texto = scanner.nextLine();


        System.out.println("Cadena digitada: " + texto);
        System.out.println("Cadena alrevez: " + reverse(texto));
    }

    public static String reverse(String texto) {
        String textoReverse = "";

        for (int i = texto.length()-1; i >= 0; i--) {
            textoReverse += texto.charAt(i);
        }

        return textoReverse;
    }
}
