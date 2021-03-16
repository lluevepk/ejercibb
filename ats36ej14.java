//Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000

import java.util.Scanner; 
public class ats36ej14 {
    public static void main(String args[]){  
    Scanner entrada = new Scanner (System.in);
    int sueldo, suma=0, masdemil=0;

    for (int i=1; i<=10; i++){
    System.out.print ("Indique un número: ");
    sueldo= entrada.nextInt ();
    suma+=sueldo;

    if (sueldo>=1000){
        masdemil++; 
    }
    }
    System.out.println ("La suma de todos los sueldos es "+suma); 
    System.out.println ("La cantidad de sueldos mayores a $1000 es "+masdemil); 
}
}
