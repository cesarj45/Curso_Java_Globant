package ejercicios;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int i = 1, lcorrectas = 0, lincorrectas = 0;
        String cadena;

        do {
            System.out.println("Ingresa la cadena " + i+": ");
            i++;
            cadena = entrada.nextLine();
            cadena = cadena.toUpperCase();
            if (cadena.length()<6 && cadena.substring(0,1).equals("X") && cadena.substring(cadena.length()-1).equals("O")){
                lcorrectas++;
            }
            else {
                lincorrectas++;
            }
        }while (!cadena.equals("&&&&&"));
        System.out.println("Lecturas correctas: " + lcorrectas);
        System.out.println("Lecturas incorrectas: " + (lincorrectas-1));
    }
}
