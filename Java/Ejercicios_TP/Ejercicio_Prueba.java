package Ejercicios_TP;

import java.util.Scanner;

public class Ejercicio_Prueba {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días a registrar: ");
        int n = Input.nextInt();

        double[] presion = new double[n];
        double[] temperatura = new double[n];
        double[] humedad = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("  Presión: ");
            presion[i] = Input.nextDouble();
            System.out.print("  Temperatura: ");
            temperatura[i] = Input.nextDouble();
            System.out.print("  Humedad: ");
            humedad[i] = Input.nextDouble();
        }
        
        boolean salir = false;
        while (salir == false) {
            System.out.println();
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar valores máximos");
            System.out.println("2. Salir");
            System.out.print("Opción: ");
            int opcion = Input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Máximo de presión: " + maximo(presion));
                    System.out.println("Máximo de temperatura: " + maximo(temperatura));
                    System.out.println("Máximo de humedad: " + maximo(humedad));
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Reintentar.");
            }

        }

        Input.close();
    }

    public static double maximo(double[] arreglo) {
        double maximo = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }
}
