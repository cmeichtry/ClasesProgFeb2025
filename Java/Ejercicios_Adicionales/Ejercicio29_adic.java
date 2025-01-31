package Ejercicios_Adicionales;

public class Ejercicio29_adic {

    public static void main(String[] args) {
        /*
        Crear una matriz de tamaño 5 × 5 donde los elementos de la diagonal principal sean
        1, 2, 3, 4, 5, y el resto de los elementos sean 0.
         */
        int n = 5;
        int aux = n;
        int[][] matriz = new int[n][n];
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j == n-1)
                    matriz[i][j] = aux--;
                else
                    matriz[i][j] = 0;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}