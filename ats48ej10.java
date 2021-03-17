/*Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el arreglo
(N es digitado por el usuario)
*/
import java.util.Scanner;
public class ats48ej10 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        int ultimo=0;
    
        //Declarar un array de 10 numeros enteros y pedir 10
        int arreglo[] = new int [10];

        System.out.print("Indique los elementos del array\n");
        for (int i=0; i<10;i++){
        System.out.print((i+1)+". Indique el número: ");
        arreglo[i] = entrada.nextInt();
        }

        //Pedir un número y una posición
        System.out.print("Indique un número: ");
        int numero = entrada.nextInt();
        System.out.print("Indique una posición: ");
        int posicion = entrada.nextInt();

        if (posicion<9){ //Si la posicion elegida es la última
        
        for (int i=8; i>=0;i--){
        arreglo[i+1]= arreglo[i];
        }
        arreglo [0] = ultimo;
        }
        System.out.print("El nuevo arreglo es...\n");
        for (int i=0; i<10;i++){
        System.out.print(i+arreglo[i]);
        } 

        if (posicion<9){ //Si la posicion elegida no es la última
        
        for (int i=0; i<posicion;i++){
        arreglo[i+1]= arreglo[i];

        arreglo [posicion] = numero;
    }
    }   
        System.out.print("El nuevo arreglo es...\n");
        for (int i=0; i<posicion;i++){
        System.out.print(i+arreglo[i]);
        }  
      
}
}
