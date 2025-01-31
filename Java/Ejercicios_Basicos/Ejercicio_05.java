package Ejercicios_Basicos;


public class Ejercicio_05 {

    public static void main(String[] args) {
        /* Consigna:
            Messi es una persona un tanto indecisa, por lo que le pidió a usted 
            que desarrolle un programa que lo ayude a decidir qué tomar en función 
            de la temperatura.

            - Si la temperatura es menor a 20°, tomará café.
            - Si la temperatura es mayor a 28,5°, tomará gaseosa.
            - En cualquier otro caso, tomará mate.

            Escriba un programa que:
            1. Indique la temperatura actual.
            2. Muestre por consola la decisión tomada.
         */
        float temp = 22.3f; //esto tambien podría ser una entrada por consola
       
        if(20 - temp > 0){
            System.out.println("La temperatura es " + temp + ". Debe tomar cafe");
        }
        else if(temp - 28.5f > 0){
            System.out.println("La temperatura es " + temp + ". Debe tomar gaseosa");
        }
        else{
            System.out.println("La temperatura es " + temp + ". Debe tomar mate");
        }
    }
}
