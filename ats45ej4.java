/*Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden:
el primero, el ultimo, el segundo, el penultimo, el tercero, etc.
*/
import java.util.Scanner;
public class ats45ej4 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        int numeros[] = new int [10];

        for (int i=0; i<10;i++){
        System.out.print((i+1)+". Indique un número: ");
        numeros[i] = entrada.nextInt();
    }
        System.out.println(numeros[0]);
        System.out.println(numeros[9]);
        System.out.println(numeros[1]);
        System.out.println(numeros[8]);
        System.out.println(numeros[2]);
        System.out.println(numeros[7]);
        System.out.println(numeros[3]);
        System.out.println(numeros[6]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);

    }   
}

