package POO;

import java.util.Scanner;

public class Operacion_3 {
    private int numero1;
    private int numero2;

    public Operacion_3(){

    }
    public Operacion_3(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(int numero1) { // Set
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {  // Set
        this.numero2 = numero2;
    }
    public int getNumero1() {  // Get
        return numero1;
    }
    public int getNumero2() {  // Get
        return numero2;
    }
    public void crearOperacion(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el numero 1: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingresa el numero 2: ");
        numero2 = entrada.nextInt();
    }
    public int sumar(){
       return numero1+numero2;
    }
    public int restar(){
        return numero1-numero2;
    }

}

