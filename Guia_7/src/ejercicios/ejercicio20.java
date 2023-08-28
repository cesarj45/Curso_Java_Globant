package ejercicios;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int [][] matrix = {{2,7,6},{9,5,1},{4,3,8}};
        int carry = 0, fila = 0, columna = 0, dprin = 0, dsecu = 0, x;
        boolean magic = true;
        /*
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.println("Ingresa el valor ["+i+"]["+j+"]: ");
                matrix[i][j] = entrada.nextInt();
            }
        }*/
        System.out.println("Matriz: ");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j<3; j++){
            carry += matrix[0][j];
        }
        x=2;
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                if (matrix[i][j]>9){
                    magic = false;
                    break;
                }
                fila += matrix[i][j];
                columna += matrix[j][i];
                if (i==j){ // Diagonal principal
                    dprin += matrix[i][j];
                }
            }
            dsecu += matrix[i][x--]; // Diagonal secundaria
            //x--;
            if (fila != carry || columna != carry){
                magic = false;
                break;
            }else {
                fila = 0;
                columna = 0;
            }
        }

        if (magic){
            if (dprin != carry || dsecu != carry){
                magic = false;
            }
        }

        if (magic){
            System.out.println("La matriz es Magica.");
        }else{
            System.out.println("La matriz No es Magica.");
        }
    }

}