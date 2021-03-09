/*Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. 
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
*/
import java.util.Scanner;  

public class ats15ej3{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        float guille;
    
        System.out.print ("Indique el importe de Guillermo: ");
        guille = entrada.nextFloat ();
        float luis= guille/2;
        float juan= (guille+luis)/2;
        float total= guille+luis+juan;

        System.out.println("\nEntre los 3 tienen "+total+" dólares"); 
    }
}
