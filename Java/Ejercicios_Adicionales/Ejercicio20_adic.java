package Ejercicios_Adicionales;
import java.util.Scanner;
public class Ejercicio20_adic {

    public static void main(String[] args) {
        /*
        Escribir un programa que muestre la suma de los n primeros números impares mayores
        a cero. (El número n debe ingresarse por consola).
         */
        
        Scanner Input = new Scanner(System.in); 
        int n;
        int suma = 0;
        int contador = 0;
        int i = 1;

        System.out.print("Ingrese un número: ");
        n = Input.nextInt();

        while (contador < n) {
            if (i % 2 != 0) {
                suma += i;
                contador++;
            }
            i++;
        }

        System.out.println("La suma de los " + n + " primeros números impares es: " + suma);

        Input.close();
    }
}