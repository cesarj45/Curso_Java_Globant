package ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String [] args){
        int a,b;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        a = entrada.nextInt();
        System.out.println("Ingresa el primer numero: ");
        b = entrada.nextInt();
        System.out.println("Las suma es : " + (a+b));
    }
}
