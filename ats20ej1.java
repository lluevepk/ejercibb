//Programa que lea un número entero y muestre si el número es múltiplo de 10
import java.util.Scanner;  

public class ats20ej1{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        int num;
    
        System.out.print ("Indique un número: ");
        num = entrada.nextInt ();
        
        if (num%10==0){
        System.out.println("El número indicado es divisible por 10"); 
        }
        else {
        System.out.println("El número indicado no es divisible por 10"); 
        }
    }
}