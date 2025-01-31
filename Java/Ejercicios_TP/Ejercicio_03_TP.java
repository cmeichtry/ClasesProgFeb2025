package Ejercicios_TP;

import java.util.Scanner;

public class Ejercicio_03_TP {

    public static void main(String[] args) {
        /*
        Escribe un programa que lea 10 cadenas de caracteres desde el teclado y
        los almacene en un arreglo. Luego, el programa debe:
        • Ordenar el arreglo en orden ascendente.
        • Pedir al usuario que ingrese cadena y buscar en el arreglo
          utilizando el algoritmo de búsqueda.
        • Indicar si el número está presente en el arreglo y en qué posición.
        */
        
        Scanner Input = new Scanner(System.in);
        String[] cadenas = new String[10];

        System.out.println("Ingrese 10 cadenas de caracteres:");
        for(int i = 0; i < 10; i++){
            System.out.print("Cadena " + (i + 1) + ": ");
            cadenas[i]=Input.nextLine();
        }
        
        String temp;
        for(int i = 0; i < cadenas.length-1; i++){
            for(int j = 0; j < cadenas.length - 1 - i; j++){
                if(cadenas[j].compareTo(cadenas[j+1])>0){
                    temp = cadenas[j];
                    cadenas[j] = cadenas[j + 1];
                    cadenas[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Cadenas ordenadas: [");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.print(cadenas[i]);
            if (i < cadenas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        Boolean encontrado = false;
        while(encontrado == false){
            System.out.print("Ingrese una cadena a buscar: ");
            String buscar = Input.nextLine();
            
            int posicion = -1;
            for(int i = 0; i < cadenas.length; i++){
                if(cadenas[i].equals(buscar)){
                    posicion = i;
                }
            }
            
            if(posicion >= 0){
                System.out.println("La posición es: " + posicion);
                encontrado = true;
            }
            else{
                System.out.println("No se encontró. Reintente");
            }
        }
        
        Input.close();
    }
}
