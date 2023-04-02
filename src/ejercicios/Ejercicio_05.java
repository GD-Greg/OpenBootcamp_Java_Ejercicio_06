package ejercicios;

// Crea un ArrayList de tipo String, con 4 elementos.
// Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio_05 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Cadena1");
        lista.add("Cadena2");
        lista.add("Cadena3");

        LinkedList<String> listaEnlazada = new LinkedList<String>();

        for (String e : lista) {
            listaEnlazada.add(e);
        }

        for(int i = 0; i < listaEnlazada.size(); i++) {
            System.out.println(listaEnlazada.get(i));
        }
    }
}

