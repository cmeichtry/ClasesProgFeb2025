package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio35_adic {

    public static void main(String[] args) {
        /*
         * Escribir un programa que cuente cuántas palabras tiene una frase. Asume que las
            palabras están separadas por espacios.
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = Input.nextLine();

        int palabras = 1;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                palabras++;
            }
        }
        
        System.out.println("La frase tiene " + palabras + " palabras.");

        Input.close();
    }
}
