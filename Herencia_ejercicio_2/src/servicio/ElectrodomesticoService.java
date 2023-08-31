package servicio;

import entidad.Electrodomestico;

import java.util.Scanner;

public class ElectrodomesticoService {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico crearElectrodomestico(){
        String color;
        String consumo;
        int peso;
        System.out.println("Ingresa el color del Electrodomestico: ");
        color = entrada.nextLine();
        System.out.println("Ingresa el consumo: ");
        consumo =  entrada.nextLine();
        System.out.println("Ingresa el peso(kg): ");
        peso = entrada.nextInt();

        color = color.toUpperCase();
        color = comprobarColor(color);

        consumo = consumo.toUpperCase();
        consumo = "" + comprobarConsumoEnergetico(consumo.charAt(0));

        return new Electrodomestico(precioFinal(consumo.charAt(0),peso),color,consumo.charAt(0),peso);
    }
    private String comprobarColor(String color){
        if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL")|| color.equals("GRIS")){
            return color;
        }else return "BLANCO";
    }
    public char comprobarConsumoEnergetico(char letra){
        if (letra >= 'A' && letra<='F'){
            return letra;
        }else return 'F';
    }
    public int precioFinal(char consumo, int peso){
        int precio = 1000;
        if (consumo == 'A'){
            precio += 1000;
        } else if (consumo == 'B') {
            precio += 800;
        } else if (consumo == 'C') {
            precio += 600;
        }else if (consumo == 'D') {
            precio += 500;
        }else if (consumo == 'E') {
            precio += 300;
        }else if (consumo == 'F') {
            precio += 100;
        }

        if(peso >= 1 && peso <= 19){
            precio += 100;
        }else if (peso >= 20 && peso <= 49) {
            precio += 500;
        }else if (peso >= 50 && peso <= 79) {
            precio += 800;
        }else if (peso >= 80) {
            precio += 1000;
        }
        return precio;
    }
}
