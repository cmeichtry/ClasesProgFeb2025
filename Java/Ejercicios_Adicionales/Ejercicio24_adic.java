package Ejercicios_Adicionales;
import java.util.Scanner;
public class Ejercicio24_adic {

    public static void main(String[] args) {
        /*
        Calcular el factorial de un número ingresado por el usuario. Se debe verificar que el
        número ingresado sea mayor o igual a cero.
         */

        Scanner Input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = Input.nextInt();

        if (num < 0) {
            System.out.println("El número debe ser mayor o igual a cero.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + num + " es: " + factorial);
        }
        
        Input.close();
    }
}