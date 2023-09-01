package entidad;

import java.util.Scanner;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumo;
    protected int peso;
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public Electrodomestico(){}
    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public void crearElectrodomestico(){
        String color;
        String consumo;
        int peso;
        System.out.println("Ingresa el color del Electrodomestico: ");
        color = entrada.next();
        System.out.println("Ingresa el consumo: ");
        consumo =  entrada.next();
        System.out.println("Ingresa el peso(kg): ");
        peso = entrada.nextInt();
        

        color = color.toUpperCase();
        color = comprobarColor(color);

        consumo = consumo.toUpperCase();
        consumo = "" + comprobarConsumoEnergetico(consumo.charAt(0));

        this.color = color;
        this.consumo = consumo.charAt(0);
        this.peso = peso;
        precioFinal();

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
    public void precioFinal(){
        precio = 1000;
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
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
