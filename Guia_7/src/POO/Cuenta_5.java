package POO;

import java.util.Scanner;

public class Cuenta_5 {
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;

    public Cuenta_5(){

    }
    public Cuenta_5(int numeroCuenta, long dniCliente, int saldoActual){
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    public void crearCuenta(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa tu nuevo numero de cuenta: ");
        numeroCuenta = entrada.nextInt();
        System.out.println("Ingresa tu DNI: ");
        dniCliente = entrada.nextLong();
        System.out.println("Ingresa el saldo: ");
        saldoActual = entrada.nextInt();
    }
    public void ingresar(int ingreso){
        saldoActual += ingreso;
    }
    public void retirar(int retiro){
        if(retiro<=saldoActual){
            saldoActual -= retiro;
        }else {
            saldoActual = 0;
        }
    }

    public void extraccionRapida(){
        if(saldoActual > 0){
            saldoActual -= (saldoActual*0.2);
        }else {
            System.out.println("Saldo Insuficiente.");
        }
    }
    public void consultaSaldo(){
        System.out.println("Saldo Actual: " + saldoActual);

    }

    public void consultaDatos() {
        System.out.println("Datos de la cuenta: {" +
                "numeroCuenta=" + numeroCuenta +
                ", dniCliente=" + dniCliente +
                ", saldoActual=" + saldoActual +
                '}');
    }
}
