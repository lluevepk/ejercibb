//Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
import java.util.Scanner;  
public class Ej4{

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        String nombre = entrada.nextLine();
         
        
       System.out.println("Bienvenidx " +nombre);
      }

    }
