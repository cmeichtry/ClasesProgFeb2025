package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio05_adic {

    public static void main(String[] args) {
        /*
        Escribir un código que lea un numero ingresado por consola e indique si
            es par o impar
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero;

        numero = Input.nextInt();

        if (numero % 2 == 0) {
            System.out.print("Es par");
        } else {
            System.out.print("Es impar");
        }

        Input.close();
    }
}
