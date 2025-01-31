package Ejercicios_Adicionales;
import java.util.Scanner;

public class Ejercicio25_adic {

    public static void main(String[] args) {
        /*
        Ingresar 5 números y mostrarlos:
        1) en el mismo orden introducido.
        2) en orden inverso al introducido.
         */
        
        Scanner Input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número: ");
            numeros[i] = Input.nextInt();
        }

        System.out.println("Números ingresados en el mismo orden: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nNúmeros ingresados en orden inverso: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        Input.close();
    }
}