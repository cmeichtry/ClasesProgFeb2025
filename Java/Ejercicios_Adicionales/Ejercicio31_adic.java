package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio31_adic {

    public static void main(String[] args) {
        /*
        Crear una matriz n × n donde cada elemento sea el resultado de a[i][j] = i × j;
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = Input.nextInt();

        int[][] matriz = new int[n][n];
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = i * j;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        Input.close();
    }
}