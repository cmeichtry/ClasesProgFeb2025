package Ejercicios_Adicionales;
import java.util.Scanner;

public class Ejercicio11_adic {
    public static void main(String[] args) {
        /*
        Leer un número ingresado por consola. Si el número es positivo, mostrar su cuadrado;
        de lo contrario, calcular y mostrar el doble del número
        */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = Input.nextInt();

        if (numero > 0) {
            System.out.println("El cuadrado del número es: " + numero * numero);
        } else if (numero < 0){
            System.out.println("El doble del número es: " + numero * 2);
        }

        Input.close();
    }
}