package ejercicios;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        int num1 = entrada.nextInt();
        if(num1 % 2 == 0){
            System.out.println("Es un numero par.");
        }
        else{
            System.out.println("No es numero par.");
        }
    }
}
