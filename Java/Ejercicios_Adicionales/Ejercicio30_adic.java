package Ejercicios_Adicionales;

public class Ejercicio30_adic {

    public static void main(String[] args) {
        /*
        Crear una matriz 8 × 8 que represente un tablero de ajedrez, utilizando 1 para las
        casillas negras y 0 para las blancas.
         */
        int n = 8;

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = 0;
                    }
                } else {
                    if (j % 2 == 0) {
                        matriz[i][j] = 0;
                    } else {
                        matriz[i][j] = 1;
                    }
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
