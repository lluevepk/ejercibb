//Pedir 10 números y escribir la suma total
import java.util.Scanner; 
public class ats34ej10 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        int suma = 0;

        for (int i=1; i<=10; i++){
        System.out.print ("Indique un número: ");
        int numero= entrada.nextInt ();
        
            suma+=numero; 
  }
    System.out.println ("La suma de todos los números introducidos es "+suma); 

      
}
}
