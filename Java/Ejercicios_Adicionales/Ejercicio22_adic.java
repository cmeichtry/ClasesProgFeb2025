package Ejercicios_Adicionales;
import java.util.Scanner;
public class Ejercicio22_adic {

    public static void main(String[] args) {
        /*
        Mostrar por consola un triángulo de asteriscos de altura n.
         */
        
        Scanner Input = new Scanner(System.in);

        System.out.print("Ingrese la altura del triángulo: ");
        int n = Input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Input.close();
    }
}