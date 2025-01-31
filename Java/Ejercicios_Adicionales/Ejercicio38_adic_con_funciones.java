package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio38_adic_con_funciones {

    public static void main(String[] args) {
        /*
         * Escribir un programa que reciba dos cadenas y determine si son iguales (sin distinguir
            entre mayúsculas y minúsculas).
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String cadena = Input.nextLine();

        System.out.print("Ingrese otra frase: ");
        String cadena2 = Input.nextLine();

        boolean iguales;
        
        iguales = cadenasIguales(cadena, cadena2);

        imprimir(iguales);

        Input.close();
    }

    public static void imprimir(boolean iguales) {
        if (iguales) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son distintas");
        }
    }
    
    public static boolean cadenasIguales(String c1, String c2) {
        c1 = c1.toLowerCase();
        c2 = c2.toLowerCase();
        int aux = 0;

        if (c1.length() != c2.length()) {
            return false;
        }

        while (aux < c1.length()) {
            if (c1.charAt(aux) != c2.charAt(aux)) {
                return false;
            }
            aux++;
        }
        return true;
    }

}
