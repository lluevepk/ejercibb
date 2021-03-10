//Write a Java program to print the area and perimeter of a circle

import java.util.Scanner;
public class jbe11 {
    public static void main(String args[]){  

        Scanner entrada = new Scanner (System.in);
        double pi=3.14, radio, area, perimetro;
    
        System.out.print ("Indique un número: ");
        radio = entrada.nextDouble();

        area= pi*Math.pow(radio,2);
        perimetro= 2*pi*radio;
        
        System.out.println("El área es: "+area+"\nEl perímetro es: "+perimetro);
        }
    }  

