/*Construir un programa que simule el funcionamiento de una calculadora, que puede realizar las cuatro
operaciones aritméticas básicas (suma, resta, producto, división) con valores numéricos enteros. 
El usuario debe especificar la operación con el primer caracter del primer parámetro de la línea de 
comandos: S o s para la suma; R o r para la resta; P, p, M, m para el producto y D o d para la división.
*/
import java.util.Scanner;  
public class ats24ej11v2 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        System.out.println ("Indique un número entero: ");
        int num1 = entrada.nextInt();
        System.out.println ("Indique otro número entero: ");
        int num2 = entrada.nextInt();
        System.out.println ("S/s = suma; R/r = resta; P/p/M/m = multiplicación; D/d = división");
        System.out.println ("Indique la operación: ");
        char operacion =  entrada.next().charAt(0);

        switch (operacion)
        {
        case 'S','s':   
            System.out.println(num1+num2); 
            break; 
        case 'R','r':   
            System.out.println(num1-num2);
            break; 
        case 'P','p','M','m':   
            System.out.println(num1*num2);             
            break; 
        case 'D','d':   
            System.out.println(num1*num2);             
            break; 
        default:
            System.out.println ("Error en los datos ingresados, por favor intente nuevamente");
            break;     
        }
    }    
}
