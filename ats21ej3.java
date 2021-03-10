//Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
import java.util.Scanner;

public class ats21ej3 {
    public static void main(String args[] ) {  
        Scanner entrada = new Scanner (System.in);
        char letra;
    
        System.out.print ("Indique una letra: ");
        letra = (char) entrada.nextInt();
        
        System.out.println(Character.isUpperCase(letra) ? "La letra es mayúscula" : "La letra es minúscula"); 
        
    }
}

