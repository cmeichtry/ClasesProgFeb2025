package Ejercicios_Basicos;

public class Ejercicio_03 {

    public static void main(String[] args) {
        /* Consigna:
            El mercado donde suele comprar gaseosas ha lanzado una promoción,
            5 gaseosas por 28$.
            Messi además de comprar las gaseosas, decide agregar 5 paquetes de 
            galletitas, de las cuales cada paquete cuesta 4$.
            El cajero, decide hacerle un descuento del 10% por pago en efectivo.
        
            Realice un programa que indique:
            1. El precio de cada gaseosa si lleva la promoción.
            2. El precio final sin ningún tipo de promoción.
            3. El precio final pagando en efectivo.
            
            Los resultados deben mostrarse por consola con un formato adecuado.
         */

        int cantGaseosas = 5;
        int cantGalletitas = 5;
        
        float precioGaseosas = 28;
        float precioGalletitas = 4;
        
        float descEfectivo = 10;
        
        //inciso 1
        float precioUnidad = precioGaseosas/cantGaseosas;
        
        System.out.println("El precio de una gaseosa es de: " + precioUnidad);
        
        float precioSinPromo = precioGaseosas + precioGalletitas * cantGalletitas;
        
        System.out.println("El precio sin promo es de: " + precioSinPromo);
        
        float descuento = (precioSinPromo * descEfectivo)/100;
        
        float precioConPromo = precioSinPromo- descuento; 
        
        System.out.println("El precio con promo es de: " + precioConPromo);
    }

}
