//Write a Java program to print the sum of two numbers
import java.util.Scanner;  
public class jbe2 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        float num1,num2;
    
        System.out.print ("Indique un número: ");
        num1 = entrada.nextFloat ();
        System.out.print ("Indique otro número: ");
        num2 = entrada.nextFloat();
        float total = num1+num2; 

        System.out.println("El resultado es "+total); 
    }   
}
