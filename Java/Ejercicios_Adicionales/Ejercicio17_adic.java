package Ejercicios_Adicionales;
import java.util.Scanner;

public class Ejercicio17_adic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int N = input.nextInt();
        
        System.out.print("Ingrese un número: ");
        int mayor = input.nextInt();

        for (int i = 1; i < N; i++) { // i = 1 porque ya se ingreso un número
            System.out.print("Ingrese un número: ");
            int num = input.nextInt();
            if (num > mayor) {
                mayor = num;
            }
        }

        System.out.println("El mayor número ingresado fue: " + mayor);
        input.close();
    }
}
