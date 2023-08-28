package ejercicios;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        int [][] matrix = new int[3][3];
        int n, num;
        System.out.println("Ingresa el tamaño del vector: ");
        n = entrada.nextInt();
        int[] pos = new int[5], v = new int[n];

        System.out.println("Matriz: ");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                matrix[i][j] = (int) (Math.random()*100);
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpuesta: ");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(" " + matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}