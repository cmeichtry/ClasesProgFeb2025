package Ejercicios_Basicos;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        /*Consigna:
            Messi decide poner a prueba sus habilidades de programación y lo desafía a 
            dibujar dos cuadrados de asteriscos en la consola.

            - El tamaño del lado del cuadrado será ingresado por consola.
            - El programa debe dibujar:
            1. Un cuadrado relleno del número 10.
            2. Un cuadrado con solo el borde del numero 10 y el interior vacío.
        */
        
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int n = Input.nextInt();
                for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("10 ");
            }
            System.out.println();
        }
         
        System.out.println();
                
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                //System.out.print("10 ");
                if(i==1 || i == n){
                    System.out.print("10 ");
                }
                else{
                    if(j == 1 || j == n){
                        System.out.print("10 ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
        
        
    }
}
