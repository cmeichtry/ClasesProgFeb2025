package Ejercicios_Basicos;

public class Ejercicio_02 {

    public static void main(String[] args) {
        /* Consigna:
            Messi desea comprar 9 gaseosas para un cumpleaños, para asegurarse
            de llevar el dinero exacto decide escribir un código que calcule el 
            gasto total sabiendo que el precio de cada gaseosa es de 6.75$. 
        
            El programa debe realizar las siguientes acciones:
            1. Declarar las variables necesarias para representar la cantidad de
            gaseosas y el precio por unidad.
            2. Calcular la gasto total usando un operador aritmético.
            3. Mostrar en consola el resultado con el siguiente formato:
                            "El gasto total es de XX$"
         */
        int totalGaseosas = 9; //inciso 1
        float precioGaseosa = 6.75f; //inciso 1
        
        float costoTotal = totalGaseosas * precioGaseosa; //inciso 2
        
        System.out.println("El gasto total es de " + costoTotal + "$"); //inc 3
    }
}
