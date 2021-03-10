/*Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. 
Con meses de 28, 30 y 31 dias. Sin años bisiestos. 
*/
import java.util.Scanner;  
public class ats24ej10 {

    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
    
        System.out.print ("Indique un día: ");
        float dia = entrada.nextFloat ();
        System.out.print ("Indique un mes: ");
        float mes = entrada.nextFloat ();
        System.out.print ("Indique un año: ");
        float año = entrada.nextFloat ();
        
        if (año!=0){
            if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
                
                if (dia<=31){
                    System.out.println("La fecha es correcta"); 
                    }
                    else {
                        System.out.println("Fecha incorrecta"); 
                        }    
            }
            if ((mes==4)||(mes==6)||(mes==9)||(mes==11)){
                
                if (dia<=30){
                    System.out.println("La fecha es correcta"); 
                    } 
                    else {
                        System.out.println("Fecha incorrecta"); 
                        }
            }
            if (mes==2){
                
                if (dia<=28){
                    System.out.println("La fecha es correcta"); 
                    }
                    else {
                        System.out.println("Fecha incorrecta"); 
                        }
            }
        
        }
    } 
}
    

