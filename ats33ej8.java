//Pedir un número N, y mostrar todos los números del 1 al N
import java.util.Scanner; 
public class ats33ej8 {
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);

        System.out.print ("Indique un número: ");
        int numero = entrada.nextInt ();
        
        for (int i=1; i<=numero; i++){

        System.out.println (i);
        }
        }
    
}
