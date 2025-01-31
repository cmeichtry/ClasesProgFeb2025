package Ejercicios_TP;

public class Ejercicio_01_TP {

    /*
    Crea un programa que genere una matriz de 5x5 de números enteros aleatorios
    entre 1 y 100. Luego, el programa debe:
    • Calcular la suma de los elementos en la diagonal principal.
    • Calcular la suma de los elementos en la diagonal secundaria.
    • Determinar cuántos números son pares y cuántos son impares.
    */
    public static void main(String[] args) {
        int n = 5;
        int m[][] = new int[n][n];

        int diagPrinc = 0;
        int diagSec = 0;

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (int) (Math.random() * 100 + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
                if(i == j){
                    diagPrinc += m[i][j];
                }
                if(i + j == n - 1){
                    diagSec += m[i][j];
                }
                if(m[i][j] % 2 == 0){
                    pares++;
                }
                else{
                    impares++;
                }
                
            }
        System.out.println();
        }
        
        System.out.println("La suma de la diagonal principal es: " + diagPrinc);
        System.out.println("La suma de la diagonal secundaria es: " + diagSec);
        System.out.println();
        System.out.println("El total de pares es de: " + pares);
        System.out.println("El total de impares es de: " + impares);
    }
}
