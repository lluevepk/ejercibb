//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
import java.util.Scanner;
public class jbe6 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        int num1,num2;
    
        System.out.print ("Indique un número: ");
        num1 = entrada.nextInt();
        System.out.print ("Indique otro número: ");
        num2 = entrada.nextInt();
        float suma = num1+num2, resta = num1-num2, multiplicacion = num1*num2, division = num1/num2, resto = num1%num2; 


        System.out.print("Los resultados son\n"+suma+"\n"+resta+"\n"+multiplicacion+"\n"+division+"\n"+resto);     }   
}
