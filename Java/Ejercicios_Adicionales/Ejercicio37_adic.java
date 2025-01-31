package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio37_adic {

    public static void main(String[] args) {
        /*
         * Escribir un programa que convierta todas las letras de una cadena a mayúsculas y
        luego a minúsculas.
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String cadena = Input.nextLine();
        System.out.println("Original: " + cadena);
        System.out.println("Mayusculas: " + cadena.toUpperCase());
        System.out.println("Minusculas: " + cadena.toLowerCase());

        Input.close();
    }
}
