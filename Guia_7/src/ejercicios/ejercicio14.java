package ejercicios;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double euros;
        String divisa;
        System.out.println("Ingresa la cantidad de euros: ");
        euros = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingresa la moneda a convertir (dolar,yen,libra): ");
        divisa = entrada.nextLine();
        convertEuro(euros,divisa);
    }
    public static void convertEuro(double euros, String divisa){
        divisa = divisa.toUpperCase();
        switch (divisa){
            case "DOLAR":
                System.out.println(euros + " Euros es igual a: $" + (euros*1.28611) + " Dolares.");
                break;
            case "YEN":
                System.out.println(euros + " Euros es igual a: " + (euros*129.852) + " Yenes.");
                break;
            case "LIBRA":
                System.out.println(euros + " Euros es igual a: " + (euros*0.86) + " Libras.");
                break;
            default:
                System.out.println("Opcion no valida.");

        }
    }
}