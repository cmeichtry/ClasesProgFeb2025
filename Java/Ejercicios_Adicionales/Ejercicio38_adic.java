package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio38_adic {

    public static void main(String[] args) {
        /*
         * Escribir un programa que reciba dos cadenas y determine si son iguales
            (sin distinguir entre mayúsculas y minúsculas).
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String cadena = Input.nextLine();
        
        System.out.print("Ingrese otra frase: ");
        String cadena2 = Input.nextLine();

        cadena = cadena.toLowerCase();
        cadena2 = cadena2.toLowerCase();

        boolean iguales = true;
        int aux = 0; //ABCDEF

        if(cadena.length() != cadena2.length()){
            iguales = false;
        }

        while(iguales == true && aux <= cadena.length() - 1){
            System.out.println("Cadena 1: " + cadena.charAt(aux));
            System.out.println("Cadena 2: " + cadena2.charAt(aux));
            if(cadena.charAt(aux) != cadena2.charAt(aux)){
                iguales = false;
            }
            aux++;
        }
        
        if(iguales){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas son distintas");
        }

        Input.close();
    }
}
