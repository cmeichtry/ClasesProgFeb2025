package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio02_adic {

    public static void main(String[] args) {
        /*
        Escribir un programa que realice la siguiente operación, a/b − 2c,
        donde a, b y c son números enteros. Definir correctamente las variables.
        */
        Scanner Input = new Scanner(System.in);
        
        float a, b, c;
        
        float resultado;
        
        System.out.print("Ingresa a: ");
        a = Input.nextInt();
        System.out.print("Ingresa b: ");
        b = Input.nextInt();
        System.out.print("Ingresa c: ");
        c = Input.nextInt();
        
        resultado = (a/b) - (2*c);
        System.out.println("Resultado: " + resultado);

        Input.close();
    }
}
