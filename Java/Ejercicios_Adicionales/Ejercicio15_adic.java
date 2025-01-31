package Ejercicios_Adicionales;
import java.util.Scanner;

public class Ejercicio15_adic {
    public static void main(String[] args) {
        /*
        Pedir 10 números por consola. Al finalizar, mostrar la suma de todos los números
        ingresados y cuántos de ellos son mayores a 500.
        */

        Scanner Input = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un numero: ");
            numero = Input.nextInt();
            suma += numero;
            if (numero > 500) {
                contador++;
            }
        }

        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("Hay " + contador + " números mayores a 500");

        Input.close();
    }
}