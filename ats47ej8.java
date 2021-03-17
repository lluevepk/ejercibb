/*Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 nros. 
Después se debe pedir un número y una posición, insertarlo en la posición indicada, 
desplazando los que entén detrás.
*/
import java.util.Scanner;
public class ats47ej8 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
    
        //Declarar un array de 10 numeros enteros y pedir 8
        int arreglo[] = new int [10];

        System.out.print("Indique los elementos del array\n");
        for (int i=0; i<8;i++){
        System.out.print((i+1)+". Indique el número: ");
        arreglo[i] = entrada.nextInt();
        }

        //Pedir un número y una posición
        System.out.print("Indique un número: ");
        int numero = entrada.nextInt();
        System.out.print("Indique una posición: ");
        int posicion = entrada.nextInt();

        //Avanzar una posición más
        for (int i=0; i<posicion;i++){
        arreglo[i+1]= arreglo[i];

        //Insertar el numero 
        arreglo [posicion] = numero;
    }
        //Imprimir
        System.out.print("El nuevo arreglo es...\n");
        for (int i=0; i<posicion;i++){
        System.out.print(i+arreglo[i]);
        }        
}
}