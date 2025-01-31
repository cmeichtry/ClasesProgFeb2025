package Ejercicios_Adicionales;

import java.util.Scanner;

public class Ejercicio09_adic_con_funciones {

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
        
        bhaskara(a, b, c);

        Input.close();
    }
    
    public static void bhaskara(double a, double b, double c){
        double x1, x2, determinante;
        
        determinante = b * b - 4 * a * c;
        
        if(determinante < 0){
            System.out.println("No hay raices reales");
        }
        else{
            x1 = (-b + Math.sqrt(determinante))/(2 * a);
            x2 = (-b - Math.sqrt(determinante))/(2 * a);
            if(x1 == x2){
                System.out.println("Las raices son iguales: x1 = x2 = " + x1);
            }
            else{
                System.out.println("Las raices son distintas: x1 = " + x1 + "x2 " + x2);
            }
        }
    }
}
