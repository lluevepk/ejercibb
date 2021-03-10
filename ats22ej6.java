//Hacer un programa que tome dos números y diga si ambos son pares o impares

import java.util.Scanner;  
public class ats22ej6 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        float num1,num2;
    
        System.out.print ("Indique un número: ");
        num1 = entrada.nextFloat ();
        System.out.print ("Indique otro número: ");
        num2 = entrada.nextFloat ();
        
        if ((num1%2==0) && (num2%2==0)){
            System.out.println("Ambos números son pares");          
        } 
        else if ((num1%2!=0) && (num2%2!=0)){
            System.out.println("Ambos números son impares");  
        } 
        else{ 
            System.out.println("Uno es impar y el otro par");
            
        } 
    }
}
