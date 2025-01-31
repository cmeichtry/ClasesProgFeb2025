package Teoría;

import java.util.Scanner;

public class K_UserInput {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        //int num = Input.nextInt();
        //System.out.println("El doble del numero ingresado es: " + (2*num));
        
        //para ingresar una cadena/string/palabra
        
        System.out.println("Ingrese un string");
        
        String palabra = Input.nextLine();
        
        System.out.println("La palabra es: " + palabra);
        
        /*
        nextBoolean()	// lee un boolean
        nextByte()	// lee un byte
        nextDouble()	// lee un double
        nextFloat()	// lee un float
        nextInt()	// lee un int
        nextLine()	// lee un String
        nextLong()	// lee un long
        nextShort()	// lee un short
        */
    }
}
