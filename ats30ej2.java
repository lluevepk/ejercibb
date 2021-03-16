//Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
import java.util.Scanner; 
public class ats30ej2 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        System.out.print ("Indique un número: ");
        int numero = entrada.nextInt ();

        while (numero !=0){
            if (numero>0){
            System.out.println ("El número es positivo");
            
            }
            else{
            System.out.println ("El número es negativo");
            } 
        }
 
}  

            
}
