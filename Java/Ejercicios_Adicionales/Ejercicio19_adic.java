package Ejercicios_Adicionales;

public class Ejercicio19_adic {
    public static void main(String[] args) {
        /*
        Calcular la suma de los primeros 10 números naturales (Los números naturales
        comienzan desde el 1).
        */
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros 10 números naturales es: " + suma);
    }
}