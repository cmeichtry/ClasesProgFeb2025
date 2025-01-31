package Teoría;

public class E_Condicionales {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("x= " + x);
        
        System.out.print("Usando solo IF: ");
        if(x > 2){
            //si no se cumple la condicion "se saltea" este if y no muestra nada
            System.out.println("x es mayor que 2");
        }
                     
        System.out.print("Usando IF/ELSE: ");
        if(x > 2){
            System.out.println("x es mayor que 2");
        }
        else{
            System.out.println("x es menor o igual a 2");
        }
                
        System.out.print("Usando IF/ELSE IF: ");
        if(x > 2){
            System.out.println("x es mayor que 2");
        }
        else if(x == 2){
            System.out.println("x es igual a 2");
        }
        else{
            System.out.println("x es menor a 2");
        }
        
        System.out.print("Usando operador ternario: ");
        String rta = (x > 2) ? "Mayor a 2" : "Menor o igual a 2";
        System.out.println(rta);
        
    }
}
