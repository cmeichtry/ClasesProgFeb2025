package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio36_adic {

    public static void main(String[] args) {
        /*
         * Escribir un programa que reemplace todas las vocales de una cadena con el carácter ’*’.
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String cadena = Input.nextLine();
        char c;
        
        for(int i = 0; i < cadena.length(); i++){
            c = cadena.charAt(i);
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    cadena = cadena.replace(c, '*');
                    break;
            }
        }
        System.out.println(cadena);

        Input.close();
    }
}
