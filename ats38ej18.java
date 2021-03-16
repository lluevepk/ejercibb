/*Ej17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide
de 5 facturas introducidad: Facturacion total, cantidad de litros vendidos del artículo 1 y cuántas facturas
se emitieron de más de $600
Ej18: Modificar el ejercicio anterior, suponiendo que ya existen los precios de los articulos:
Art1 $0,6xL, Art2 $3xL, Art3 $1,25xL
*/
import java.util.Scanner; 
public class ats38ej18 {
    public static void main(String args[]){
    Scanner entrada = new Scanner (System.in);
    int articulo, cant_litros, cant_art1=0;
    double precio_litro=0, fact_total=0, importe, fact_600=0; 
    
    for (int i=1; i<=5; i++){
    System.out.print("Indique el artículo: ");
    articulo = entrada.nextInt();
    System.out.print("Indique los litros: ");
    cant_litros = entrada.nextInt();

    importe=precio_litro*cant_litros;
    fact_total+=importe;

    if (articulo==1){
        cant_art1+=cant_litros;
    }
    if (importe>=600){
        fact_600++;
    }
    if (articulo==1){
        precio_litro = 0.6;
    }
    else if (articulo==2){
        precio_litro = 3;
    }
    else if (articulo==3){
        precio_litro = 1.25;
    }
    System.out.println("La facturación total es "+fact_total);
    System.out.println("La cantidad de litros vendidos del artículo 1 es "+cant_art1);
    System.out.println("La cantidad de facturas de más de 600 es "+fact_600);
}
}
}
