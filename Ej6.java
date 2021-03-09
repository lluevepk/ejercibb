//Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
import java.util.Scanner;  
public class Ej6{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indique un número: ");
        double num = entrada.nextDouble();

        if (num/2==0){
        System.out.println("El número que indicó es divisible por 2");
        }

        else {
        System.out.println("El número que indicó no es divisible por 2");
      }
    }
}