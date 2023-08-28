package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        nombre = nombre.toLowerCase();
        System.out.println("Tu nombre en minusculas: " + nombre);
        nombre = nombre.toUpperCase();
        System.out.println("Tu nombre en mayusculas: " + nombre);
    }
}