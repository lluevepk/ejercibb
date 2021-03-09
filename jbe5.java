//Write a Java program that takes two numbers as input and display the product of two numbers
import java.util.Scanner;  
public class jbe5 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        int num1,num2;
    
        System.out.print ("Indique un número: ");
        num1 = entrada.nextInt();
        System.out.print ("Indique otro número: ");
        num2 = entrada.nextInt();
        float total = num1*num2; 

        System.out.println("El resultado es "+total); 
    }   
}   

