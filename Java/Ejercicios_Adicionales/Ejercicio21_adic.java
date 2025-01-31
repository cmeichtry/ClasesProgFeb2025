package Ejercicios_Adicionales;
import java.util.Scanner;
public class Ejercicio21_adic {

    public static void main(String[] args) {
        /*
        Escribir un programa que imprima la tabla de multiplicar de un número n ingresado
        por consola.
         */
        
        Scanner Input = new Scanner(System.in);
        int n;
        int i = 1;

        System.out.print("Ingrese un número: ");
        n = Input.nextInt();

        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        }

        Input.close();
    }
}