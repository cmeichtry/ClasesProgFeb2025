package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio28_adic {

    public static void main(String[] args) {
        /*
        Crear una matriz identidad de tamaño n × n.
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = Input.nextInt();

        int[][] matriz = new int[n][n];
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        Input.close();
    }
}