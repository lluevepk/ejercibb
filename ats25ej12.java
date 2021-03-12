//Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente  
import java.util.Scanner;  
public class ats25ej12 {

    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        System.out.println ("Indique la nota: ");
        float nota = entrada.nextFloat ();

        if ((nota>=0)&&(nota<3)){
            System.out.println(nota+" = Insuficiente"); 
        }
        else if ((nota>=3)&&(nota<5)){
            System.out.println(nota+" = Suficiente"); 
        }
        else if ((nota>=5)&&(nota<7)){
            System.out.println(nota+" = Bien"); 
        }
        else if ((nota>=7)&&(nota<9)){
            System.out.println(nota+" = Notable"); 
        } 
        else if ((nota>=9)&&(nota<=10)){
            System.out.println(nota+" = Sobresaliente"); 
        }
    } 
}
   