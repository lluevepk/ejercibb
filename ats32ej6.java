//Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos

import java.util.Scanner; 
public class ats32ej6 {
    public static void main(String args[]){  
    Scanner entrada = new Scanner (System.in);

    int numero, suma=0;
    
        do{
            System.out.print ("Indique un número: ");
            numero = entrada.nextInt ();
            suma+=numero; 
                  
        }while (numero !=0);

        System.out.println ("La suma de todos los números introducidos es "+suma); 

        }
  
}
