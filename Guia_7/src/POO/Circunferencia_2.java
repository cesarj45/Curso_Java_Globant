package POO;

import java.util.Scanner;

public class Circunferencia_2 {
    private float radio;
    public Circunferencia_2(float radio){
        this.radio = radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float getRadio() {
        return radio;
    }
    public void crearCircunferencia() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el radio: ");
        radio = entrada.nextInt();
    }
    public float area() {
        return (float) (Math.PI * Math.pow(radio,2));
    }
    public float perimetro() {
        return (float) (2 * Math.PI * radio);
    }
}
