package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la frase: ");
        String frase = entrada.nextLine();
        if(frase.equals("eureka")){
            System.out.println("Correcto!");
        }
        else{
            System.out.println("Incorrecto!");
        }
    }
}
