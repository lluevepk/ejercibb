//Pide un número (de 0 a 10) y muestra la tabla de multiplicar de ese número

import java.util.Scanner;
public class ats37ej16 {
    public static void main(String args[]){  

        Scanner entrada = new Scanner (System.in);
        int num;
    
        {System.out.print("Indique un número: ");
        num = entrada.nextInt();
        if((num>=0)&&(num<=10));
        
        for (int i = 0; i <= 10; i++) 
        System.out.println(num+"x"+i+"="+num*i);
        }
        
         
    }
}


