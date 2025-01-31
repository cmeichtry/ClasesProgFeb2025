package Teoría;

public class J_String {
    public static void main(String[] args) {
        String cadena = "Hola mundo cruel";
        
        int n = cadena.length();

        System.out.println("El tamaño de la cadena es: " + n);
        
        
        System.out.println(cadena.toUpperCase());   // MAYUSCULAS
        
        System.out.println(cadena.toLowerCase());   // minusculas
        
        int posChar;
        posChar = cadena.indexOf('m'); //posicion del caracter m
        
        System.out.println("Posicion de m: " + posChar);
        
        int posStr;
        posStr = cadena.indexOf("cruel");
        
        System.out.println("Posicion de cruel: " + posStr);
        
        char c;
        c = cadena.charAt(0); //"Hola mundo cruel"
        
        System.out.println("Primer caracter: " + c);
        
        
        String cadena2 = " pero bonito"; //"Hola mundo cruel" + " pero bonito"
        
        String conc;
        conc = cadena.concat(cadena2);
        
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena que agrego: " + cadena2);
        System.out.println("Cadena final: " + conc);
        
        System.out.println(cadena.concat(cadena2));
        
        conc = conc + " zzz";
        System.out.println("Cadena con zzz" + conc);
        conc = conc + 'z';
        System.out.println("Cadena con zzzz" + conc);
        
        String cadena3 = "Hola";
        
        char[] caracteres = cadena3.toCharArray();
        
        //{'H', 'o', 'l', 'a'}
        
        //reemplazar caracteres
        System.out.println("Cadena original: " + cadena);
        cadena = cadena.replace(" ", "");
        System.out.println("Cadena sin espacios: " + cadena);
        
        String cadena4 = "Banana amarilla";
        System.out.println("Cadena con " + 'a' +": " + cadena4);
        cadena4 = cadena4.replace('a', '*');
        System.out.println("Cadena sin " + 'a' +": " + cadena4);
        

        
    }
}
