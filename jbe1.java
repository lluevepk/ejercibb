//Write a Java program to print 'Hello' on screen and then print your name on a separate line

import java.util.Scanner;  

public class jbe1{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        String nombre;
    
        System.out.print ("Indique su nombre: ");
        nombre = entrada.next ();

        System.out.println("Hello\n"+nombre); 
    }
}