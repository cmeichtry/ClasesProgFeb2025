package Ejercicios_Basicos;

import java.util.Scanner;
public class Ejercicio_04 {
    public static void main(String[] args) {
        /* Consigna:
            Messi decide proteger sus gaseosas guardándolas en una heladera con 
            contraseña (la contraseña es 1812).
            
            Escriba un programa que permita ingresar un número entero por consola 
            y evalúe si se corresponde con la contraseña establecida. 
            
            - Si el número ingresado es correcto, el programa debe mostrar el 
              mensaje: "Contraseña correcta".
            - En caso contrario, debe mostrar el mensaje: "Reintente".
        
            Opcional: Hacer que el programa se ejecute en loop hasta que la
            contraseña sea la correcta.
        */  
        int contraseña = 1812;
        
        boolean estoyIntentando = true; //flag
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Ingrese la contraseña: ");
        int clave_ingresada = Input.nextInt();
        
        while(estoyIntentando == true){
            if(clave_ingresada == contraseña){
                System.out.println("Contraseña correcta");
                estoyIntentando = false;
            }
            else{
                System.out.println("Reintente");
                System.out.print("Ingrese la contraseña: ");
                clave_ingresada = Input.nextInt();
            }
        }
        
    }

}
