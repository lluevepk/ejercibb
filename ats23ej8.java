//Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene
import java.util.Scanner;  

public class ats23ej8{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        int num;
    
        System.out.print ("Indique un número del o al 99999: ");
        num = entrada.nextInt ();
        
        if (num<=9){
        System.out.println("El número es de una cifra");  
        }        
        else if ((num>9) && (num<=99)){
        System.out.println("El número es de dos cifras");
        }          
        else if ((num>99) && (num<=999)){
        System.out.println("El número es de tres cifras");
        }    
        else if  ((num>999) && (num<=9999)){
        System.out.println("El número es de cuatro cifras"); 
    }  
        else if  ((num>9999) && (num<=99999)){
        System.out.println("El número es de cinco cifras");  
    }   
        else {
        System.out.println("Número incorrecto");
        } 
    }
}