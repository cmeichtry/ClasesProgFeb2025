package Ejercicios_Adicionales;
import java.util.Scanner;
public class Ejercicio23_adic {

    public static void main(String[] args) {
        /*
        Contar todos los números pares entre dos números ingresados por consola
         */
        
        Scanner Input = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = Input.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = Input.nextInt();

        int contador = 0;

        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        System.out.println("La cantidad de números pares entre " + num1 + " y " + num2 + " es: " + contador);

        Input.close();
    }
}