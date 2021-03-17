/*Leer los datos correspondientes a dos tablas de 12 elementos númericos, y mezclarlos en una 3ra de la forma:
3 de la tabla A, 3 de la tabla B, otros 3 de la A, otros 3 de la B, etc. 
*/
import java.util.Scanner;
public class ats46ej6 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        //Declaramos variables a, b, c (a+b)
        int a[] = new int [12]; 
        int b[] = new int [12];
        int c[] = new int [24];

        //Pedimos array a
        System.out.print("Indique los elementos del array A\n");
        for (int i=0; i<12;i++){
        System.out.print((i+1)+". Indique el número: ");
        a[i] = entrada.nextInt();
    }
        //Pedimos array b
        System.out.print("Indique los elementos del array B\n");
        for (int i=0; i<12;i++){
        System.out.print((i+1)+". Indique el número: ");
        b[i] = entrada.nextInt();
    }

        //Armamos array c (mezcla de a y b); iterador i para a y b, iterador j para c
        int j=0;
        for (int i=0; i<12;i++){
        c[j] = a[i]; 
        j++;
        c[j] = b[i];
        j++;  
}
        System.out.print("El tercer arreglo es:\n");
        for (int i=0; i<24;i+=3){
        System.out.print(c[i]+" ");
}
}
}
