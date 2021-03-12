/*Hacer un programa que pase de una unidad de kilo a otra unidad de medida de masa, mostrar en pantalla 
un menú con las opciones posible. 
*/
import java.util.Scanner; 
public class ats26ej14 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        System.out.print ("Indique el número de kilos o gramos: ");
        float numero = entrada.nextFloat ();
        System.out.println ("1.Pasar de kilos a gramos\n2.Pasar de gramos a kilos");
        System.out.print ("Indique la operación que desea realizar: ");
        int operacion = entrada.nextInt();

        switch (operacion)
        {
        case 1:   
            float kiloagramos = numero*1000; 
            System.out.println (numero+" kilos es igual a "+kiloagramos+" gramos"); 
            break; 
        case 2:   
            float gramosakilo = numero/1000; 
            System.out.println (numero+" gramos es igual a "+gramosakilo+" kilos"); 
            break;   
        default:
            System.out.println ("Ha ingresado datos no válidos, por favor intente nuevamente");
            break;   
        }
    }
} 

