package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio34_adic {
    public static void main(String[] args) {
        /*
         * Escribir un programa que determine si una cadena es un palíndromo (se lee igual al
            derecho y al revés, ignorando espacios y mayúsculas)
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String frase = Input.nextLine();

        frase = frase.toLowerCase().replace(" ", ""); //convierto a minúsculas y saco espacios

        int i = 0;
        int j = frase.length() - 1;
        boolean es_palindromo = true;

        while(i < j && es_palindromo == true){
            if(frase.charAt(i) != frase.charAt(j)){
                es_palindromo = false;
            }
            i++;
            j--;
        }
        
        if(es_palindromo == true){
            System.out.println("La frase es un palíndromo");
        }
        else{  
            System.out.println("La frase no es un palíndromo");
        }

        Input.close();
    }
}
