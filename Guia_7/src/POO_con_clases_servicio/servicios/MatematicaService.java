package POO_con_clases_servicio.servicios;

import POO_con_clases_servicio.entidades.Matematica;

import java.util.Scanner;

public class MatematicaService {

    public Matematica llenarNumeros(){
        Matematica objeto = new Matematica();
        objeto.setNum1(Math.random()*10);
        objeto.setNum2(Math.random()*10);
        System.out.println("Num 1: " + objeto.getNum1());
        System.out.println("Num 2: " + objeto.getNum2());
        return objeto;
    }
    public double devolverMayor(Matematica objeto){
        if(objeto.getNum1()>objeto.getNum2()){
            return objeto.getNum1();
        }else return objeto.getNum2();
    }

    public double calcularPotencia(Matematica objeto){
        if(objeto.getNum1()>objeto.getNum2()){
            return Math.pow(Math.round(objeto.getNum1()),Math.round(objeto.getNum2()));
        }else return Math.pow(Math.round(objeto.getNum2()),Math.round(objeto.getNum1()));
    }

    public double calcularRaiz(Matematica objeto){
        if(objeto.getNum1()>objeto.getNum2()){
            return Math.sqrt(Math.abs(objeto.getNum2()));
        }else return Math.sqrt(Math.abs(objeto.getNum1()));
    }

}
