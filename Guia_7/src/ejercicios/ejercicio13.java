package ejercicios;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Ingresa el tamaño del cuadrado: ");
        n = entrada.nextInt();

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
