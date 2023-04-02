package ejercicios;

import java.io.*;

/**
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 */


public class Ejercicio_08 {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:\\Learning\\Programación\\Cursos - OpenBootcamp\\07. Java Básico\\OpenBootcamp_Java_Ejercicio_6\\texto.txt");
            PrintStream fichero2 = new PrintStream("texto.txt");
            function(fichero, fichero2);

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void function (InputStream fileIn, PrintStream fileOut) {
        try {
            byte []datos = fileIn.readAllBytes();
            fileIn.close();

            fileOut.write(datos);
            fileOut.close();

            System.out.println("Copia realizada con exito");
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
