/*
una compañia de venta de carros usados, paga a su personal de ventas un salario
de $1000 mensuales, mas una comision de $150 por cada carro vendido,
mas el 5% del valor de la venta por carro. cada mes el capturista de la empresa ingresa en la computadora 
los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un vendedor dado
*/
import java.util.Scanner;  

public class ats15ej4{  
    public static void main(String args[]){  
        Scanner entrada = new Scanner (System.in);
        float venta, carro;
    
        System.out.print ("Indique la cantidad de autos vendidos: ");
        carro = entrada.nextFloat ();
        System.out.print ("Indique el importe de autos vendidos: ");
        venta = entrada.nextFloat ();

        float mensual= 1000+(150*carro)+(venta*5/100);
       

        System.out.println("\nEl salario mensual es de "+mensual+" pesos"); 
    }
}