package POO_con_clases_servicio.servicios;

import POO_con_clases_servicio.entidades.Puntos;

import java.util.Scanner;

public class PuntosService {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public PuntosService(){}

    public Puntos crearPuntos(){
        double x1,y1,x2,y2;
        System.out.println("Ingresa el valor de x1: ");
        x1 = entrada.nextDouble();
        System.out.println("Ingresa el valor de y1: ");
        y1 = entrada.nextDouble();
        System.out.println("Ingresa el valor de x2: ");
        x2 = entrada.nextDouble();
        System.out.println("Ingresa el valor de y2: ");
        y2 = entrada.nextDouble();

        return new Puntos(x1,y1,x2,y2);
    }

    public double calcularDistancia(Puntos objeto){
        return Math.sqrt(Math.pow((objeto.getX1()- objeto.getX2()),2) + Math.pow((objeto.getY1()- objeto.getY2()),2));
    }
}
