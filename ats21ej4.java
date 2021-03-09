/*En MegaPlaza, se hace un 20% de descuento a los clientes cuya compra supere los
US$300. ¿Cuál será la cantidad que pagará una persona por su compra?
*/
import java.util.Scanner;  

public class ats21ej4{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        float num, desc;
    
        System.out.print ("Indique un importe: ");
        num = entrada.nextFloat ();

        desc = num-(num*20/100);
        
        if (num>300){
        System.out.println("El importe a pagar es "+desc); 
        }
        else {
        System.out.println("El importe a pagar es "+num); 
        }
    }
}