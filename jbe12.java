//Write a Java program that takes three numbers as input to calculate and print the average of the numbers
import java.util.Scanner;  
public class jbe12 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        System.out.print ("Indique un número: ");
        int num1 = entrada.nextInt();
        System.out.print ("Indique otro número: ");
        int num2 = entrada.nextInt();
        System.out.print ("Indique otr número: ");
        int num3 = entrada.nextInt();
        
        int total = (num1+num2+num3)/3; 

        System.out.println("El promedio es "+total); 
    }   
}  