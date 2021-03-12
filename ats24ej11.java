/*Construir un programa que simule el funcionamiento de una calculadora, que puede realizar las cuatro
operaciones aritméticas básicas (suma, resta, producto, división) con valores numéricos enteros. 
El usuario debe especificar la operación con el primer caracter del primer parámetro de la línea de 
comandos: S o s para la suma; R o r para la resta; P, p, M, m para el producto y D o d para la división.
*/
import java.util.Scanner;  
public class ats24ej11 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        System.out.print ("Indique un número entero: ");
        int num1 = entrada.nextInt();
        System.out.print ("Indique otro número entero: ");
        int num2 = entrada.nextInt();
        System.out.println ("S/s = suma; R/r = resta; P/p/M/m = multiplicación; D/d = división");
        System.out.print ("Indique la operación: ");
        char operacion =  entrada.next().charAt(0);

        if ((operacion=='S')||(operacion=='s')){
            System.out.println(num1+num2); 
        }
        else if ((operacion=='R')||(operacion=='r')){
            System.out.println(num1-num2); 
        }
        else if ((operacion=='P')||(operacion=='p')||(operacion=='M')||(operacion=='m')){
            System.out.println(num1*num2); 
        }
        else if ((operacion=='D')||(operacion=='d')){
            System.out.println(num1/num2);
        } 
        else {
            System.out.println("Error en los datos ingresados, pruebe otra vez");
            } 
    }
}
