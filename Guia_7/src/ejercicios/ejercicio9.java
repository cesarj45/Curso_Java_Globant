package ejercicios;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase o palabra: ");
        String frase = entrada.nextLine();
        char a = frase.charAt(0);
        if(a == 'A'){
            System.out.println("Correcto!");
        }
        else{
            System.out.println("Incorrecto!");
        }
    }
}