package POO_con_clases_servicio.servicios;

import POO_con_clases_servicio.entidades.Raices;

import java.util.RandomAccess;
import java.util.Scanner;

public class RaicesService {
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public RaicesService(){}

    public Raices ingresarValores(){
        double a,b,c;
        System.out.println("Ingresa el valor de A: ");
        a = entrada.nextDouble();
        System.out.println("Ingresa el valor de B: ");
        b = entrada.nextDouble();
        System.out.println("Ingresa el valor de C: ");
        c = entrada.nextDouble();
        return new Raices(a,b,c);
    }

    public double getDiscriminante(Raices object){
        return (Math.pow(object.getB(),2)-4*object.getA()* object.getC());
    }

    public boolean tieneRaices(Raices object){
        if (getDiscriminante(object)>0){
            return true;
        }else return false;
    }

    public boolean tieneRaiz(Raices object){
        if (getDiscriminante(object)==0){
            return true;
        }else return false;
    }

    public void obtenerRaices(Raices object){
        if (tieneRaices(object)){
            System.out.println("Resultado x1= "+ ((-object.getB()+Math.sqrt(getDiscriminante(object))) / (object.getA()*2)));
            System.out.println("Resultado x2= "+ ((-object.getB()-Math.sqrt(getDiscriminante(object))) / (object.getA()*2)));
        }else System.out.println("No tiene dos soluciones.");
    }

    public void obtenerRaiz(Raices object){
        if (tieneRaiz(object)){
            System.out.println("Resultado x1= "+ ((-object.getB()+Math.sqrt(getDiscriminante(object))) / (object.getA()*2)));
        }else System.out.println("No tiene una unica solucion.");
    }

    public void calcular(Raices object){

        if (getDiscriminante(object)<0){
            System.out.println("No tiene solucion.");
        }else if(tieneRaices(object)){
            obtenerRaices(object);
        }else if(tieneRaiz(object)){
            obtenerRaiz(object);
        }
    }

}
