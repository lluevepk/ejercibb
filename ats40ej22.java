//Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso
import java.util.Scanner;
public class ats40ej22 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        float calificacion=0;
        int alumnos_susp=0;
        alumnos_susp++;
        alumnos_susp+=calificacion;

        for (int i=1; i<=5; i++){
        System.out.print("Indique la calificación del alumno: ");
        calificacion = entrada.nextFloat();
        }

        if (calificacion<4){
        System.out.println("Hay "+alumnos_susp+" alumnos suspensos");
        }
        else{
        System.out.println("No hay alumnos suspensos");
        }
        
    }
    } 

