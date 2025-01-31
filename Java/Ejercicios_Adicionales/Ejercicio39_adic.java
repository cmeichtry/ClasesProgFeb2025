package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio39_adic {

    public static void main(String[] args) {
        /*
         * Escribir un programa que cuente cuántas veces aparece un carácter específico en una
            cadena.
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = Input.nextLine();
        
        System.out.print("Ingrese un caracter: ");
        char caracter = Input.next().charAt(0);

        int n = cadena.length();
        int contador = 0;

        for(int i = 0; i < n ; i++){
            if(cadena.charAt(i) == caracter){
                contador++;
            }
        }

        System.out.println("El caracter " + caracter + " aparece " + contador + " veces");

        Input.close();
    }
}
