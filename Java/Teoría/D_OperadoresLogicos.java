package Teoría;

public class D_OperadoresLogicos {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;

        System.out.print("AND (tal cosa Y tal cosa): ");
        System.out.println(x > 2 && x < y); //3 > 2 Y 3 < 2
        
        System.out.print("OR (tal cosa O tal cosa): ");
        System.out.println(x > 2 || x < y); //3 > 2 O 3 < 2
        
        System.out.print("NOT (niega logicamente): ");
        System.out.println(!(x > 2 || x < y));
    }
}
