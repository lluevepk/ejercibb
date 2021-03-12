/*Hacer un programa que simule un cajero automático con un saldo inicial de $1000 dólares, con el 
siguiente menú de opciones: 
1. Ingresar dinero a la cuenta.
2. Retirar dinero de la cuenta.
3. Salir
*/
import java.util.Scanner; 
public class ats26ej13 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        System.out.println ("1.Ingresar dinero a la cuenta\n2.Retirar dinero de la cuenta\n3.Salir");
        System.out.print ("Indique la operación que desea realizar: ");
        int operacion = entrada.nextInt();
        final int fijo = 1000;
       
        switch (operacion)
        {
        case 1:   
            System.out.print ("Indique el importe que desea depositar: ");
            int deposito = entrada.nextInt(); 
            int suma = fijo+deposito; 
            System.out.println ("Su saldo actual es de $"+suma); 
            break; 
        case 2:   
            System.out.print ("Indique el importe que desea retirar: ");
            int retiro = entrada.nextInt(); 
            int resta = fijo-retiro; 
            System.out.println ("Usted ha retirado $"+retiro); 
            System.out.println ("Su saldo actual es de $"+resta);
            break; 
        case 3:   
            System.out.println ("Ha finalizado la operación");
            break;   
        default:
            System.out.println ("Ha ingresado una operación no válida, por favor intente nuevamente");
            break;   
        }
    }
}
