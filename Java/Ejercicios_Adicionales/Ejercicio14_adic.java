package Ejercicios_Adicionales;
import java.util.Scanner;

public class Ejercicio14_adic {
    public static void main(String[] args) {
        /*
        Ingresar números por consola hasta que se ingrese un número negativo. Al finalizar,
        mostrar cuántos números se han ingresado en total (sin contar el negativo).
        */
        Scanner Input = new Scanner(System.in);
        int numero;
        int contador = 0;

        do {
            System.out.print("Ingresa un numero: ");
            numero = Input.nextInt();
            contador++;
        } while (numero >= 0);

        System.out.println("Se han ingresado " + (contador - 1) + " números en total");

        Input.close();
    }
}