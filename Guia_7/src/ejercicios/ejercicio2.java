package ejercicios;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
