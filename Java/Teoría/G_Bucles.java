package Teoría;

public class G_Bucles {

    public static void main(String[] args) {
        int n = 0;

        System.out.println("Uso de while");
        while (n < 5) {
            System.out.println(n);
            n++;
        }
              
        
        int m = 0;
        System.out.println("Uso de do/while");

        while (m > 0 && n < 5) {
            System.out.println(n);
            m++;
        }
        
        m = 0;
        
        do {
            System.out.println(m);
            m++;
        } while (m > 0 && m < 5);

        /* OBS: Notar que la diferencia entre while y do while, es que en 
            este ultimo siempre se realiza una primera iteración, por eso 
            en el caso de do while entra al bucle a pesar de no cumplir la 
            condicion a priori
         */
        
        System.out.println("Uso de for");
        
        for (int i = 0; i > -5; i--) {
            System.out.println(i);
        }
        
        //Uso de break y continue

        System.out.println("Uso de break");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break; //interrumpe el bucle
            }
            System.out.println(i);
        }

        System.out.println("Uso de continue");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; //vuelve de inmediato a la condicion
            }
            System.out.println(i);
        }

    }
}
