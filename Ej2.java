//Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
public class Ej2{

    public static void main(String []args){
        int num1= 10;
        int num2= 8;

        if (num1>num2){
       System.out.println(num1+ " es mayor que " +num2);
        }

      else if (num1<num2){
       System.out.println(num1+ " es menor que " +num2);
      }

      else {
       System.out.println(num1+ " es igual a " +num2);
      }
    }
}