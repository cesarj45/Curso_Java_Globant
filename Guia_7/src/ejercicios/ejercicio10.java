package ejercicios;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int limite, suma = 0;
        do {
            System.out.println("Ingresa el limite positivo: ");
            limite = entrada.nextInt();
        }while (limite < 1);

        while (suma <= limite){
            System.out.println("Ingresa un numero a la suma: ");
            suma += entrada.nextInt();
        }
        System.out.println("la suma excedio el limite! " + suma);
    }
}