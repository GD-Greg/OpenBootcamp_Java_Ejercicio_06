package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = new String();
        ArrayList<String> dias = new ArrayList<>();
        ArrayList<String> horarios = new ArrayList<>();
        HashMap<String, String> usuario = new HashMap<>();

        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");

        horarios.add("Opcion 1: 08:30am - 10:30am");
        horarios.add("Opcion 2: 10:40am - 12:40am");
        horarios.add("Opcion 3: 12:50am - 14:50pm");
        horarios.add("Opcion 4: 15:00pm - 17:00pm");
        horarios.add("Opcion 5: 17:10pm - 19:10pm");
        horarios.add("Opcion 6: 21:20pm - 23:20pm");


        System.out.println("___-- Compra y Venta de Tickets --___");
        System.out.println("Digite su nombre de usuario y contraseña: ");
        usuario.put(scanner.nextLine(), scanner.nextLine());
        System.out.println("Digite su nombre completo: ");
        nombre = scanner.nextLine();

        System.out.println("___-- Dias Disponibles --___");
        for (String elemento : dias) {
            System.out.println(elemento);
        }
        System.out.println("Opción: ");
        int opcion1 = scanner.nextInt();

        System.out.println("___-- Horarios Disponibles --___");
        for (String elemento : horarios) {
            System.out.println(elemento);
        }
        System.out.println("Opción: ");
        int opcion2 = scanner.nextInt();

        ticket(nombre, opcion1, opcion2);
    }

    public static void ticket(String nombre, int opcion1, int opcion2){
        File ticket;
        try {
            ticket = new File("C:\\Learning\\Programación\\Cursos - OpenBootcamp\\07. Java Básico\\OpenBootcamp_Java_Ejercicio_6\\ticket.txt");
            if (ticket.createNewFile()) {
                System.out.println("Se ha creado el archivo");
            }
        } catch(IOException e) {
            System.out.println("No se ha podido crear el archivo" + e.getMessage());
        }

        try{
            PrintStream escritor = new PrintStream("ticket.txt");
            escritor.println("Nombre y apellido: " + nombre);
            escritor.println("Dia: " + opcion1);
            escritor.println("Hora: " + opcion2);
        } catch (FileNotFoundException e) {
            System.out.println("Excepcion: " + e.getMessage());
        }

    }
}
