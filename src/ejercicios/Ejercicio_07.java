package ejercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su
 * llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
 * Finalmente, mostraremos en cualquier caso: "Demo de código".
 */

public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println("Digite un numero: ");
        valor = scanner.nextInt();
    }

    public static int DividePorCero(int num) throws ArithmeticException{
        int resultado = 0;

        try {
            resultado = num / 0;
        } catch (ArithmeticException a) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        return resultado;
    }
}
