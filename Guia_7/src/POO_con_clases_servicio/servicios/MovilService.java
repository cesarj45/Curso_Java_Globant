package POO_con_clases_servicio.servicios;

import POO_con_clases_servicio.entidades.Movil;

import java.util.Scanner;

public class MovilService {
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public MovilService(){}

    public Movil cargarCelular(){
        String marca, modelo;
        int precio, memoriaRAM, almacenamiento;
        int[] codigo = new int[7];

        System.out.println("Ingresa la marca del movil: ");
        marca = entrada.next();

        System.out.println("Ingresa el modelo: ");
        modelo = entrada.next();

        System.out.println("Ingresa el precio: ");
        precio = entrada.nextInt();

        System.out.println("Ingresa la memoria RAM en GB: ");
        memoriaRAM = entrada.nextInt();

        System.out.println("Ingresa el almacenamiento en GB: ");
        almacenamiento = entrada.nextInt();

        Movil movil = new Movil( marca,  modelo,  precio,  memoriaRAM,  almacenamiento, codigo);
        ingresarCodigo(movil);
        return movil;
    }
    public void ingresarCodigo(Movil objeto){
        String co;
        int[] codigo = new int[7];
        do {
            System.out.println("Ingresa el codigo de 7 digitos: ");
            co = entrada.next();

        }while (co.length()!=7 || !co.matches("[0-9]+"));
        for (int i = 0; i<7; i++){
            codigo[i] = Integer.parseInt(co.substring(i,i+1));
        }
        objeto.setCodigo(codigo);
    }
}
