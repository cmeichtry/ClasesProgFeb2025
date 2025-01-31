package Ejercicios_Basicos;

public class Ejercicio_08 {

    public static void main(String[] args) {
        /* Consigna:
            Messi sigue aburrido y decide observar cuántos intentos le lleva
            sacar dos veces el número 6 al tirar un dado repetidamente (no 
            necesariamente de manera consecutiva).

            En base a esto, cada vez que se lance el dado, su programa debe:            
            - Mostrar el número que salió en esa tirada.
            - Si obtiene un 6 por primera vez, debe mostrar: 
                "¡Salió el primer 6!"
            - Si obtiene un segundo 6, debe mostrar:
                "¡Se obtuvo el segundo 6!" y la cantidad total de tiradas
                realizadas hasta ese momento.
            - Si no obtiene un 6, debe mostrar el número que salió y el número
              de tirada actual.
         */
        int tiradas = 1;
        int contSeis = 0; 
        int dado = (int)(Math.random() * 6 + 1);
        
        //El prog termina cuando contSeis == 2
        
        while(contSeis < 2){
            if(dado < 6){
                System.out.println(
                    "El resultado de la tirada " + tiradas + " es: " + dado);
            }
            else{
                contSeis++;
                if(contSeis == 1){
                    System.out.println("Salio el 1er seis");
                }
                else{
                    System.out.println("Salio el 2do seis");
                    System.out.println("Tiradas = " + tiradas);
                }
            }
            tiradas++;
            dado = (int)(Math.random() * 6 + 1);
        }
    }
}
