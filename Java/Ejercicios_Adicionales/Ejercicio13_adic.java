package Ejercicios_Adicionales;
import java.util.Scanner;

public class Ejercicio13_adic {
    public static void main(String[] args) {
        /*
        Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
        */
        
        Scanner Input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un numero: ");
            numero = Input.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
        } while (numero != 0);

        Input.close();
    }
}