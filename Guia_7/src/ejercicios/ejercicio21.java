package ejercicios;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int x = 0,y = 0, contador = 0;
        int [][] p = {{36,5,67},{89,90,75},{14,22,26}};
        int [][] m = {{1,26,36,47,5,6,72,81,95,10},
                      {11,12,13,21,41,22,67,20,10,61},
                      {56,78,87,90,9,90,17,12,87,67},
                      {41,87,24,56,97,74,87,42,64,35},
                      {32,76,79,1,36,5,67,96,12,11},
                      {99,13,54,88,89,90,75,12,41,76},
                      {67,78,87,45,14,22,26,42,56,78},
                      {98,45,34,23,32,56,74,16,19,18},
                      {24,67,97,46,87,13,67,89,93,24},
                      {21,68,78,98,90,67,12,41,65,12}};

        System.out.println("Matriz P: ");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(p[i][j] + " ");
                if (p[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz M: ");
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                System.out.print(" " + m[i][j] + " ");
                if (m[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i<10; i++){
            if (contador == 9) {
                break;
            }
            for (int j = 0; j<10; j++){
                if (contador == 9) {
                    break;
                }else {
                    x=0;
                    y=0;
                    contador = 0;
                }
                if (p[x][y] == m[i][j] && (i+2)<10 && (j+2)<10) {
                    for (int r = i; r<=(i+2); r++){
                        for (int t = j; t<=(j+2); t++){
                            if (p[x][y] == m[r][t]) {
                                contador++;
                                if (y<3){y++;}
                            }else {
                                r=i+3;
                                t=j+3;
                            }
                        }
                        y=0;
                        x++;
                    }
                }
            }
        }

        if (contador == 9){
            System.out.println();
            System.out.println("P esta contenida en M");
        }else {
            System.out.println("P No se encuentra en M");
        }
    }

}