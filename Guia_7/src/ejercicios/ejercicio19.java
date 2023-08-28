package ejercicios;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int [][] matrix = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int carry = 0;
        boolean anti = true;
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
        System.out.println("Transpuesta: ");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(" " + matrix[j][i] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                carry = (matrix[i][j])*(-1);
                if (matrix[j][i] == 0 || matrix[j][i] == carry) {
                    anti= true;
                }else{
                    anti= false;
                    break;
                }
            }
        }
        if (anti){
            System.out.println("La matriz es anti simetrica.");
        }else{
            System.out.println("La matriz No es anti simetrica.");
        }
    }

}