package Teoría;

import java.util.Scanner;

public class I_Funciones {
    /*
    
    public static tipodedato nombredelafuncion(parametro1, parametro2, ...) {
    tipodedato: lo que devuelve la función, sino devuelve nada
                es void
    nombredelafuncion: nombre de la función
    parametros: lo que recibe la función
                se escribe: tipodedato nombredelparametro
    
    para devolver algo (si el caso lo amerita):
    return loquedevuelvo
    }
    
    para llamar a la función
    si devuelve algo: variable = nombredelafunción(parametros);
    si no devuelve nada: nombredelafuncion(parametros);
    
    */
    public static void main(String[] args) {
        /*
        Ejemplo: función que devuleva la suma de dos numeros enteros y otra
        que multiplique ese resultado por dos.
        */
        Scanner Input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int x = Input.nextInt();
        System.out.print("Ingrese otro número: ");
        int y = Input.nextInt();
        
        int resultado = 0;
        
        resultado = suma(x, y); //12
        
        resultado = multiplicar(resultado);
        
        System.out.println(resultado);
    }
    
    public static int suma(int a, int b){
        return a + b;
    }

    public static int multiplicar(int a){
        return a * 2;
    }
    
}
