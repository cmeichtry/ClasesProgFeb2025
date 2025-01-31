package Teoría;

public class B_OperadoresAlgebraicos {

    public static void main(String[] args) {
        int x = 3;
        int y = 2;

        System.out.println("La suma es: " + (x + y));
        System.out.println("La resta es: " + (x - y));
        System.out.println("El producto es: " + (x * y));
        System.out.println("La division (entera) es: " + (x / y));
        
        /*OBS: tanto x como y fueron definidos como enteros, por ende la divi-
        sion, sera del tipo "entera". Para obtener un resultado con decimales,
        habrá que realizar un casteo a punto flotante.
        */
        
        System.out.println("La division es: " + (((double) x / y)));
        System.out.println("El modulo es: " + (x % y));

    }
}
