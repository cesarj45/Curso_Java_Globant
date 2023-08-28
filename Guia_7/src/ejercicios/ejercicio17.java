package ejercicios;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int n,num;
        System.out.println("Ingresa el tamaño del vector: ");
        n = entrada.nextInt();
        int[] pos = new int[5], v = new int[n];

        for (int i = 0; i<n; i++){
            v[i] = (int) (Math.random()*100);
            System.out.print( v[i]+ " ");
        }
        // v[0] = 222;
        // v[1] = 3225;
        // v[2] = 32254;
        System.out.println();

        for (int i = 0; i<n; i++){
            pos[numDigitos(v[i])-1] = pos[numDigitos(v[i])-1]+1;
        }
        for (int i = 0; i<5; i++){
            System.out.println(i+1 + " Cifras: " + pos[i]);
        }

    }
    public static int numDigitos(int num){
        int digitos = 0;
        if(num == 0){
            return 1;
        }else {
            while (num != 0){
                num = num / 10;
                digitos++;
            }
            return digitos;
        }

    }
}