package Ejercicios_Adicionales;
import java.util.Scanner;

public class Ejercicio16_adic {
    public static void main(String[] args) {
        /*
        Dadas 8 notas, determinar y mostrar la cantidad de alumnos aprobados (nota mayor
        a 7), desaprobados (nota entre 4 y 6) y aplazados (nota menor a 3). Se asume que todas las notas
        ingresadas son válidas.
        */
        Scanner input = new Scanner(System.in);

        int aprobados = 0;
        int desaprobados = 0;
        int aplazados = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            int nota = input.nextInt();
            if (nota > 7) {
                aprobados++;
            } else if (nota >= 4 && nota <= 6) {
                desaprobados++;
            } else {
                aplazados++;
            }
        }

        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos desaprobados: " + desaprobados);
        System.out.println("Cantidad de alumnos aplazados: " + aplazados);
        input.close();
    }
}