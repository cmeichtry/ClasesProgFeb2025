package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio06_adic {

    public static void main(String[] args) {
        /*
        Ingresar un número por consola e indicar si es positivo, negativo o cero.
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero;
        numero = Input.nextInt();

        if (numero > 0) {
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }

        Input.close();
    }
}
