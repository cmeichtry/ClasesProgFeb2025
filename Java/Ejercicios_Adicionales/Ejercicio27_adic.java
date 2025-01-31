package Ejercicios_Adicionales;

public class Ejercicio27_adic {

    public static void main(String[] args) {
        /*
        Crear una matriz 3 × 4 que contenga números consecutivos del 1 al 12
         */
        int n = 3;
        int m = 4;
        
        int[][] matriz = new int[n][m]; //defino la matriz e inicializo en 0
        
        int aux = 1;
        
        for(int i = 0; i < n; i++){ //0 1 2
            for(int j = 0; j < m; j++){ //0 1 2 3
                matriz[i][j] = aux++;
                System.out.print(matriz[i][j] + "\t"); //imprimir
            }
            System.out.println();
        }
    }
}