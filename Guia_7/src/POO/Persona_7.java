package POO;

import java.util.Scanner;

public class Persona_7 {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona_7(){}

    public Persona_7(String nombre, int edad, String sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void crearPersona(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.next();
        System.out.println("Ingresa tu edad: ");
        edad = entrada.nextInt();
        do {
            System.out.println("Ingresa tu sexo: ");
            sexo = entrada.next();
            sexo = sexo.toUpperCase();
            if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")){
                System.out.println("Error de captura, introduzca (H = Hombre, M = Mujer,  O = Otro).");
            }
        }while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O"));

        System.out.println("Ingresa tu peso (Kg): ");
        peso = entrada.nextDouble();
        System.out.println("Ingresa tu altura (M): ");
        altura = entrada.nextDouble();

    }

    public int calcularIMC(){
        double IMC;
        IMC = (peso / Math.pow(altura, 2));
        if(IMC < 20)
        {
            return -1;
        } else if (IMC >= 20 && IMC <=25) {
            return 0;
        }else return 1;
    }

    public boolean mayorDeEdad(){
        if(edad >= 18){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Persona_7{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
