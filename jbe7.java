//Write a Java program that takes a number as input and prints its multiplication table upto 10

import java.util.Scanner;

public class jbe7 {
    public static void main(String args[]){  

    Scanner entrada = new Scanner (System.in);
    int num;

    System.out.print("Indique un número: ");
    num = entrada.nextInt();
    
    for (int i = 0; i <= 10; i++) {
    System.out.println(num+"x"+i+"="+num*i);
    }
}
}
