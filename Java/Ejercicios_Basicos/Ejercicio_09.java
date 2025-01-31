package Ejercicios_Basicos;

public class Ejercicio_09 {
    
    public static void main(String[] args) {
        /*Consigna
            Después de aburrirse tirando dados, Messi decide averiguar cuántos
            múltiplos de 17 hay menores a 200. 
        
            Escriba un programa que:

            - Muestre en la consola todos los números que son múltiplos de 17
              menores a 200.
            - Al finalizar, indique cuántos múltiplos de 17 se encontraron.
        */
        int contador = 0;
        
        for(int i = 0; i <= 200; i++){
            if(i % 17 == 0){
                contador++;
                System.out.println("El multiplo " + contador + " es: " + i);
            }
        }
        System.out.println("La cantidad de multiplos es: " + contador);
    }
}
