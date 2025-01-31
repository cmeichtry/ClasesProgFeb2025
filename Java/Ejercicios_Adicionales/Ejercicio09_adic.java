package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio09_adic {

    public static void main(String[] args) {
        /*
        Ingresar por consola los coeficientes de una ecuación de segundo grado,
        y mostrar sus soluciones reales. Si no existen, debe indicarlo.
         */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        double a = Input.nextDouble();
        System.out.print("Ingrese b: ");
        double b = Input.nextDouble();
        System.out.print("Ingrese c: ");
        double c = Input.nextDouble();
        
        double x1 = 0.0f;
        
        double x2 = 0.0f;
        
        if((b*b-4*a*c) < 0){
            System.out.println("No hay raíces reales");
        }
        else{
            x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
            x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
            if(x1 == x2){
                System.out.println("Hay raíz doble, x1 = x2 = " + x1);
            }
            else{
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        Input.close();
    }
}