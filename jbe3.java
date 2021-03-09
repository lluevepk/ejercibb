//Write a Java program to divide two numbers and print on the screen
import java.util.Scanner;  
public class jbe3 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        int num1,num2;
    
        System.out.print ("Indique un número: ");
        num1 = entrada.nextInt();
        System.out.print ("Indique otro número: ");
        num2 = entrada.nextInt();
        float total = num1/num2; 

        System.out.println("El resultado es "+total); 
    }   
}
    

