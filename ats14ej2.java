/*Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales 
trabajadas y de su salario por hora
*/
import java.util.Scanner;  

public class ats14ej2{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in)
        float horas, sueldoh;
    
        System.out.print ("Indique la cantidad de horas semanales trabajadas: ");
        horas = entrada.nextFloat ();
        System.out.print ("Indique el sueldo por hora: ");
        sueldoh = entrada.nextFloat ();

        float total= horas*sueldoh;
       

        System.out.println("\nEl salario correspondiente semanal es de "+total+ "pesos"); 
    }
}