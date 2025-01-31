package Ejercicios_TP;

import java.util.Scanner;

public class Ejercicio_02_TP {

    /*
    Escribe un programa que lea una cadena de caracteres y determine:
    •	La longitud de la cadena.
    •	Cuántas vocales (a, e, i, o, u) contiene la cadena.
    •	Cuántas consonantes contiene la cadena.
    •	Invertir la cadena y mostrarla.
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese un cadena: ");

        String orig = Input.nextLine();

        int vocales = 0;
        int consonantes = 0;

        int longitud = orig.length();
        System.out.println("La longitud de la cadena es: " + longitud);
        System.out.println();
        String aux = orig.toLowerCase().replace(" ", "");
        
        for (int i = 0; i < aux.length(); i++) {
            switch (aux.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocales++;
                    break;
                default:
                    consonantes++;
            }
        }
        System.out.println("La cantidad de vocales es: " + vocales);
        System.out.println("La cantidad de consonantes es: " + consonantes);
        System.out.println();

        String inversa = "";
        for (int i = longitud - 1; i >= 0; i--) {
            inversa += orig.charAt(i);
        }

        System.out.println("Original: " + orig);
        System.out.println("Invertida: " + inversa);
        System.out.println();
        
        Input.close();
    }
}
