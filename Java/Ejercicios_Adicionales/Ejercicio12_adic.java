package Ejercicios_Adicionales;
import java.util.Scanner;

public class Ejercicio12_adic {
    public static void main(String[] args) {
        /*
        Leer un número ingresado por consola e indicar si es positivo o negativo. Repetir el
        proceso hasta que se ingrese un 0
        */
        Scanner Input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un numero: ");
            numero = Input.nextInt();

            if (numero > 0) {
                System.out.println("Es positivo");
            } else if (numero < 0) {
                System.out.println("Es negativo");
            } else {
                System.out.println("Es cero");
            }
        } while (numero != 0);

        Input.close();
    }
}