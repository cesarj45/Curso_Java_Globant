package ejercicios;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int[] pos, v = new int[20];
        int contador= 0, j =0;
        double n;
        for (int i = 0; i<20; i++){
            v[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i<20; i++){
            System.out.print( v[i]+ " ");
        }
        System.out.println();
        System.out.println("Ingresa el numero a buscar: ");
        n = entrada.nextInt();

        for (int i = 0; i<20; i++){
            if (v[i] == n){
                contador++;
            }
        }
        pos = new int[contador];
        for (int i = 0; i<20; i++){
            if (v[i] == n){
                pos[j++] = i+1;
            }
        }
        if(contador==1){
            System.out.print("El numero se encuentra en la posicion: ");
        }
        else {
            System.out.print("El numero se encontro en las posiciones: ");
        }
        for (int i = 0; i<contador; i++){
            System.out.print(pos[i] + " ");
        }
    }
}