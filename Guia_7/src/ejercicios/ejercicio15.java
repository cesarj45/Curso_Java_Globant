package ejercicios;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int[] v = new int[100];

        for (int i = 99; i>0; i--){
            v[i] = i;
            System.out.print(v[i] + " ");
        }

    }
}