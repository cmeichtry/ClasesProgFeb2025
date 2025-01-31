package Teoría;

public class H_Arrays {

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40};   
        
        int[] intArray_v2 = new int[4];

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        char[] charArray = {'A', 'B', 'C', 'D'};
        String[] stringArray = {"Uno", "Dos", "Tres", "Cuatro"};
        boolean[] booleanArray = {true, false, true, false};

        System.out.println("Direccion del arreglo: " + intArray); //imprime la dirección de memoria donde 
        //esta el array
        System.out.println("Primer elemento: " + intArray[0]);   // imprime el elemento indicado
        //OBS: el primer elemento es el 0

        int sizeArray = intArray.length;
        System.out.println("Tamaño del arreglo: " + sizeArray);
        
        System.out.println("Impresion de todo el arreglo");
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        
        //Modificacion de un elemento de un arreglo
        System.out.println("Primer elemento: " + intArray[0]);
        intArray[0] = 50;
        System.out.println("Primer elemento modificado: " + intArray[0]);
        
        
        int[][] matriz = {{1, 2, 3},{1, 2, 3},{1, 2, 3}}; 
        
        int n = 3;
        int m = 4;
        
        int[][] matriz_v2 = new int[n][m]; 
        
        System.out.println("Impresión de una matriz");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matriz_v2[i][j]);
            }
            System.out.println();
        }
    }
}
