package Ejercicios_Basicos;


public class Ejercicio_06 {

    public static void main(String[] args) {
        /* Consigna:
            En su día libre, Messi no sabe qué película mirar, por lo que decide 
            tirar un dado para elegir.
            
            - Si toca 1 o 4: mira una película de terror.
            - Si toca 2 o 5: mira una película de aventura.
            - Si toca 3 o 6: mira una película de comedia.
        
            Debe escribir un programa que muestre el resultado del dado y la
            película que Messi debe mirar según el número que obtuvo.
        
            Para simular un dado, puede usar el siguiente código:
            int randomNum = (int)(Math.random() % 6 + 1);
         */
        int dado = (int) (Math.random() * 6 + 1);
        System.out.println("El resultado del dado es: " + dado);
        switch (dado) {
            case 1:
            case 4:
                System.out.println("Pelicula de terror");
                break;
            case 2:
            case 5:
                System.out.println("Pelicula de aventura");
                break;
            case 3:
            case 6:
                System.out.println("Pelicula de comedia");
                break;
        }
    }
}
