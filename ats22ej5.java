/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
Si trabaja 40 horas o menos se le paga $16 por hora. 
Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
*/
import java.util.Scanner;  

public class ats22ej5{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        int horas;
    
        System.out.print ("Indique la cantidad de horas trabajadas: ");
        horas = entrada.nextInt();

        float total1 = horas*16;
        float total2 = (40*16)+((horas-40)*20);
        
        if (horas<=40){
            System.out.println("El sueldo semanal es de $"+total1);            
        }else {
            System.out.println("El sueldo semanal es de $"+total2);
      }
    }
}