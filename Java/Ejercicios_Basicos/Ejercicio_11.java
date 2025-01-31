package Ejercicios_Basicos;

public class Ejercicio_11 {
    
    public static void main(String[] args) {
        /*Consigna:
            Luego de una tarde entretenida, Messi decide mirar sus autos para
            apreciar las distintas marcas y los años en los que los compró.
            Luego de su recorrida, anotó lo siguiente:

            - FORD Mustang - Año 2020
            - CHEVROLET Camaro - Año 2023
            - BMW X6 - Año 2023
            - AUDI A4 - Año 2022
            - MINI Cooper - Año 2024
            - FIAT 600 - Año 1983

            Tareas:
            1. Organice las marcas y sus años de compra en dos arreglos.
            2. Calcule y muestre la cantidad total de vehículos que Messi posee.
            3. Imprima en consola las marcas de cada auto.
            4. Calcule y muestre el promedio de los años de compra de los autos.
            5. Messi decide intercambiar su FIAT 600 de colección por un Ferrari
            SF90 Spider (año 2025). Actualice la lista para reflejar este cambio
            y muestre nuevamente las marcas y el promedio actualizado en consola.

            Nota:
            El programa debe ser dinámico y trabajar con la lista organizada en
            estructuras de datos apropiadas.
        */
        String[] autos = {"FIAT", "CHEVROLET", "BMW", "AUDI", "MINI", "FORD"};
        int[] años = {2020, 2023, 2023, 2022, 2024, 1983};
        
        int totalAutos = autos.length;
        System.out.println("Total de autos: " + totalAutos);
        
        System.out.println("Marcas");
        for(int i = 0; i < años.length; i++){
            System.out.println(autos[i]);
        }
        
        int sumaaux = 0;
        float promedio = 0;
        for(int i = 0; i < años.length; i++){
            sumaaux += años[i];
        }
        promedio = (float)sumaaux / (años.length);
        System.out.println("El promedio de años es: " + promedio);
        
        for(int i = 0; i < autos.length; i++){
            if(autos[i] == "FIAT"){
                autos[i] = "FERRARI";
            }
            if(años[i] == 1983){
                años[i] = 2025;
            }
        }
        System.out.println();
        System.out.println("Marcas (actualizado)");
        for(int i = 0; i < años.length; i++){
            System.out.println(autos[i]);
        }
        
        sumaaux = 0;
        promedio = 0;
        for(int i = 0; i < años.length; i++){
            sumaaux += años[i];
        }
        promedio = (float)sumaaux / (años.length);
        System.out.println("El promedio nuevo de años es: " + promedio);
    }
}
