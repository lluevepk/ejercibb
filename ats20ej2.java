//Pedir dos números y decir cuál es el mayor o si son iguales
import java.util.Scanner;  

public class ats20ej2{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        float num1,num2;
    
        System.out.print ("Indique un número: ");
        num1 = entrada.nextFloat ();
        System.out.print ("Indique otro número: ");
        num2 = entrada.nextFloat ();
        
        if (num1<num2){
            System.out.println(num2+" es el número mayor");          
        } 
            else if (num1>num2){ 
            System.out.println(num1+" es el número mayor");  
        } 
            else{ 
            System.out.println("Los números son iguales");
            
        } 
    }
}