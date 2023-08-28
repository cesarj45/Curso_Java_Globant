package ejercicios;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase o palabra de 8 letras: ");
        String frase = entrada.nextLine();
        if(frase.length() == 8){
            System.out.println("Correcto!");
        }
        else{
            System.out.println("Incorrecto!");
        }
    }
}