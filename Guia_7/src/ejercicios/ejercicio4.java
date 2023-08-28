package ejercicios;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int grados;
        double gradosF;
        System.out.println("Ingresa los grados centigrados: ");
        grados = entrada.nextInt();
        gradosF = 32 + (9 * grados/5);
        System.out.println("Grados Fahrenheit: " + gradosF);
    }
}
