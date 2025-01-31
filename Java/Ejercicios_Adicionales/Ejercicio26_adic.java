package Ejercicios_Adicionales;
public class Ejercicio26_adic {

    public static void main(String[] args) {
        /*
        Escribir un programa que simule la extracción de una carta aleatoria de una baraja
        inglesa. Esta baraja incluye los palos: Picas (♠), Corazones (♡), Diamantes (♢) y Tréboles (♣). Las
        cartas van desde el As hasta el diez, además de las tres figuras: jota, reina y rey.
         */

        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};

        String[] cartas = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey"};

        int palo = (int) (Math.random() * 4);

        int carta = (int) (Math.random() * 13);

        System.out.println("La carta seleccionada es: " + cartas[carta] + " de " + palos[palo]);
    }
}