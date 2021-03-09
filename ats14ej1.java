//Hacer un programa que calcule e imprima la suma de tres calificaciones
import java.util.Scanner;  

public class ats14ej1{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        float num1, num2, num3;
    
        System.out.print ("Indique 3 números: ");
        num1 = entrada.nextFloat ();
        num2 = entrada.nextFloat ();
        num3 = entrada.nextFloat ();

        float suma = num1+num2+num3;

        System.out.println("\nLa suma es: "+suma); 
    }
}