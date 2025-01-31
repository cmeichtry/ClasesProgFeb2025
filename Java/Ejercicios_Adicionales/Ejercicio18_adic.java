package Ejercicios_Adicionales;

public class Ejercicio18_adic {
    public static void main(String[] args) {
        /*
        Imprimir todos los números enteros mayores a 4 y menores o iguales a 23.
            1) Usando while.
            2) Usando for.
        */
        // 1) Usando while.
        System.out.println("Usando while:");
        int n = 5;
        while (n <= 23) {
            System.out.println(n);
            n++;
        }

        System.out.println();
        // 2) Usando for.
        System.out.println("Usando for:");
        for (int i = 5; i <= 23; i++) {
            System.out.println(i);
        }
    }
}