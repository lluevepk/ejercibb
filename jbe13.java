//Write a Java program to print the area and perimeter of a rectangle
import java.util.Scanner;  
public class jbe13 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        System.out.print ("Indique la base: ");
        float base = entrada.nextFloat ();
        System.out.print ("Indique la altura: ");
        float altura = entrada.nextFloat ();
        
        float perimetro = (base*2)+(altura*2);
        float area = base*altura;
 

        System.out.print("El perímetro es "+perimetro); 
        System.out.print("El area es "+area); 

    }   
}
