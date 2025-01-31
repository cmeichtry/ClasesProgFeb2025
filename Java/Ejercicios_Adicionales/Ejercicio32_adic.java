package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio32_adic {

    public static void main(String[] args) {
        /*
        Escribir un programa que reciba una cadena como entrada y la devuelva
        invertida.
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = Input.nextLine();
        
        String cadenaInvertida = "";
        
        int n = cadena.length(); //tamaño de la cadena
        
        for(int i = n - 1; i >= 0; i--){
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }
        System.out.println(cadenaInvertida);

        Input.close();
    }
}