package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio03_adic_con_funciones {
    /*
    Ingresar el radio de un círculo por consola y calcular su área.
    */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        double r = Input.nextDouble();
        
        double resultado;
        
        resultado = Area(r);
        
        
        if(resultado != -100){
            System.out.println("El area es: " + resultado);
        }
        else{
            System.out.println("El area ingresada es incorrecta");
        }
        Input.close();
    }
    
    public static double Area(double r){        
        if(r > 0.0){
            return r * r * Math.PI;
        }
        else{
            return -100.0;
        }
    }
}
