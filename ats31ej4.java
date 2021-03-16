//Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido
import java.util.Scanner; 
public class ats31ej4 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        int numero, contador = 0;
        
        do{ 
           System.out.print ("Indique un número: ");
            numero = entrada.nextInt ();
        
        contador++;    
        }while
        (numero >=0);

        System.out.println ("Ha introducido "+contador+" números");

        }
 
}  

