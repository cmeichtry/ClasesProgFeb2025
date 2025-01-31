package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio33_adic {
    public static void main(String[] args) {
        /*
        Escribir un programa que cuente cuántas vocales y cuántas consonantes tiene una
        cadena ingresada por el usuario. Ignorar espacios y caracteres especiales
        */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = Input.nextLine();

        int n = cadena.length();
        
        int vocales = 0;
        int consonantes = 0;

        char c;
        cadena = cadena.toLowerCase(); //convierto a minúsculas

        for(int i = 0; i < n ; i++){
            c = cadena.charAt(i);
            if(c >= 'a' && c <= 'z'){ 
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vocales++;
                }else{
                    consonantes++;
                }
            }
        }
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);

        Input.close();
    }
}
