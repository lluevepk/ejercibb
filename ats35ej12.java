//Pedir un número y calcular su factorial
import java.util.Scanner; 
public class ats35ej12 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        int i=1, factorial=1, numero;

        System.out.print ("Indique un número: ");
         numero = entrada.nextInt ();

        while(i <=numero) {
        factorial = factorial * i;
        i++;
        }
        System.out.println ("El factorial es: "+factorial);
}  

    
}
