package ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        int num1 = entrada.nextInt();
        System.out.println("El doble es :" + (num1*2));
        System.out.println("El triple es :" + (num1*3));
        System.out.println("La raiz es :" + Math.sqrt(num1));
    }
}
