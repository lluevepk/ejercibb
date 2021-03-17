//Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden invers al establecido
import java.util.Scanner;
public class ats44ej2 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        int numeros[] = new int [5];

        for (int i=0; i<5;i++){
        System.out.print((i+1)+". Indique un número: ");
        numeros[i] = entrada.nextInt();
    }
        System.out.println(numeros[4]);
        System.out.println(numeros[3]);
        System.out.println(numeros[2]);
        System.out.println(numeros[1]);
        System.out.println(numeros[0]);
        

    }   
}
     