package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio10_adic {

    public static void main(String[] args) {
        /*
    Ingresar una nota de 0 a 10 e indicar según corresponda:
        0 ≤ Nota ≤ 3: Aplazo
        4 ≤ Nota ≤ 6: Desaprobado
        7 ≤ Nota ≤ 10: Aprobado
    En caso de ingresar un numero inválido debe imprimirse el mensaje
    "Entrada no válida"
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        int nota = Input.nextInt();

        switch(nota){
            case 1:
            case 2:
            case 3:
                System.out.println("Aplazo");
                break;
            case 4:        
            case 5:         
            case 6:
                System.out.println("Desaprobado");
                break; 
            case 7:        
            case 8:            
            case 9: 
            case 10:
                System.out.println("Aprobado");
                break; 
            default:
                System.out.println("Entrada no válida");
                break; 
        }
        
        Input.close();
    }
}