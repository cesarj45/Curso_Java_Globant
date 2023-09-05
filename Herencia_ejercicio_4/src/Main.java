import entidad.Circulo;
import entidad.Rectangulo;

public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(3);
        System.out.println("Area del Circulo: " + circulo1.calcularArea());
        System.out.println("Perimetro del Circulo: " + circulo1.calcularPerimetro());

        Rectangulo rectangulo1 = new Rectangulo(5,4);
        System.out.println("Area del Rectangulo: " + rectangulo1.calcularArea());
        System.out.println("Perimetro del Rectangulo: " + rectangulo1.calcularPerimetro());

    }
}