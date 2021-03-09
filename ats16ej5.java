/*La calificación final de un estudiante de Informática se calcula con base a las calificaciones 
de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, 
segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores entran 
a la calificación final con ponderaciones del 10%, 25%, 25% y 40%, 
Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
*/
import java.util.Scanner;  

public class ats16ej5{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        float participacion, parcial1, parcial2, exfinal;
    
        System.out.print ("Indique la nota de participación: ");
        participacion = entrada.nextFloat ();
        System.out.print ("Indique la nota del primer parcial: ");
        parcial1 = entrada.nextFloat ();
        System.out.print ("Indique la nota del segundo parcial: ");
        parcial2 = entrada.nextFloat ();
        System.out.print ("Indique la nota del examen final: ");
        exfinal = entrada.nextFloat ();

        float nota= (participacion*10/100)+(parcial1*25/100)+(parcial2*25/100)+(exfinal*40/100);
       
        System.out.println("\nLa nota final es de "+nota+" puntos"); 
    }
}