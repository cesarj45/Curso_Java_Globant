package ejercicios;

import java.util.Scanner;


public class ejercicio11 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        int op, num1 = 0, num2 = 0;
        String salir;
        boolean seguir = true;
        do {
            System.out.println("         MENU  \n" +
                    "         1.Sumar          \n" +
                    "         2.Resta          \n" +
                    "         3.Multiplicar    \n" +
                    "         4.Dividir        \n" +
                    "         5.Salir          \n" +
                    "         Elija una opcion:\n");

            do {
                op = entrada.nextInt();
                if (op < 0 || op > 5) {
                    System.out.println("Opcion no valida!");
                    System.out.println("Elija una opcion:");
                }
            } while (op < 0 || op > 5);

            if (op != 5){
                System.out.println("Ingresa el prmer numero: ");
                num1 = entrada.nextInt();
                System.out.println("Ingresa el segundo numero: ");
                num2 = entrada.nextInt();
            }

            switch (op) {
                case 1:
                    System.out.println("Suma = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Producto = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Division = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Seguro que quiere salir? ('S' para confirmar)");
                    salir = entrada.next();
                    salir = salir.toUpperCase();
                    if (salir.equals("S")) {
                        seguir = false;
                    }
                    break;
            }
        } while (seguir);

    }

}

