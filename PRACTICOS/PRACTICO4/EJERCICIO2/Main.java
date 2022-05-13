package PRACTICOS.PRACTICO4.EJERCICIO2;

import java.lang.System;
public class Main {

    public static void main(String[] args) {
        Trabajo trabajo1 = new Trabajo(1);
        Trabajo trabajo2 = new Trabajo(2);
        Trabajo trabajo3 = new Trabajo(3);

        Evaluador evaluador1 = new Evaluador(1, 0);
        Evaluador evaluador2 = new Evaluador(2, 1);
        Evaluador evaluador3 = new Evaluador(3, 2);

        Tema tema1 = new Tema("Algoritmos", 1);
        Tema tema2 = new Tema("Lenguajes de programacion", 0);
        Tema tema3 = new Tema("Recursion", 0);
        Tema tema4 = new Tema("Secuencial", 0);
        Tema tema5 = new Tema("Agentes", 1);
        Tema tema6 = new Tema("Redes de comunicacion", 1);
        Tema tema7 = new Tema("visualizacion", 1);


        trabajo1.addPalabras("Algoritmos");
        trabajo1.addPalabras("Lenguajes de programacion");
        trabajo1.addPalabras("Recursion");

        trabajo2.addPalabras("Secuencial");
        trabajo2.addPalabras("Agentes");
        trabajo2.addPalabras("visualizacion");

        trabajo3.addPalabras("Redes de comunicacion");
        trabajo2.addPalabras("Algortimos");
        trabajo2.addPalabras("Recursion");

        evaluador1.addConocimientos(tema1);
        evaluador1.addConocimientos(tema2);
        evaluador2.addConocimientos(tema3);
        evaluador2.addConocimientos(tema3);
        evaluador2.addConocimientos(tema7);
        evaluador3.addConocimientos(tema4);
        evaluador3.addConocimientos(tema5);
        evaluador3.addConocimientos(tema6);
        if (evaluador1.Evaluador_Experto()){
            System.out.println("Es experto");
        }else{
            System.out.println("no es experto");
        }
    }
}
