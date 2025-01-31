package Ejercicios_Basicos;

public class Ejercicio_07 {

    public static void main(String[] args) {
        /* Consigna:
            Messi está aburrido y decide tirar un dado repetidamente hasta que
            salga un 6. 
            Debe escribir un codigo que, cada vez que tire el dado, muestre el 
            número que salió y el numero de tirada. Cuando salga un 6, debe
            mostrar "Salió un 6" y la cantidad de tiradas que realizó para
            conseguirlo.
         */
        
        int tiradas = 1; //contador
        
        int dado = (int) (Math.random() * 6 + 1);

        while (dado < 6) {
            System.out.println(
                    "El resultado de la tirada " + tiradas + " es: " + dado);
            tiradas++;
            dado = (int) (Math.random() * 6 + 1);
        }
        
        System.out.println("Salió un 6.");
        System.out.println(
                "Se realizaron " + tiradas + " tiradas");
        
    }
}
