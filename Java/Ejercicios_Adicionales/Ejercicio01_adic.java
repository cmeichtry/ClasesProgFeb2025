package Ejercicios_Adicionales;
import java.util.Scanner;

public class Ejercicio01_adic {
    public static void main(String[] args) {
        /*
        Ingresar dos números por consola y devolver el producto de ambos.
        */

        Scanner Input = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = Input.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = Input.nextInt();

        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + (num1 * num2));

        Input.close();
    }
}