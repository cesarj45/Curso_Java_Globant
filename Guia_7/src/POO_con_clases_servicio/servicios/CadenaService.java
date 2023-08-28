package POO_con_clases_servicio.servicios;


import POO_con_clases_servicio.entidades.Cadena;

import java.util.Scanner;

public class CadenaService {

    private String frase;
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena(){
        System.out.println("Ingresa una frase: ");
        frase = entrada.next();
        return new Cadena(frase);
    }
    public void mostrarVocales(Cadena objeto){
        String f = objeto.getFrase().toUpperCase();
        int vocales = 0;
        for (int i = 0; i<f.length(); i++){
            if(f.substring(i,i+1).equals("A") || f.substring(i,i+1).equals("E") || f.substring(i,i+1).equals("I") || f.substring(i,i+1).equals("O") || f.substring(i,i+1).equals("U")){
                vocales++;
            }
        }
        System.out.println("Vocales : " + vocales);
    }

    public Cadena invertirFrase(Cadena objeto) {
        String f = objeto.getFrase();
        String fi = "";
        for (int i = f.length()-1; i>-1; i--){
            fi += f.charAt(i);
        }
        System.out.println("Cadena inversa: " + fi);

        return new Cadena(fi);
    }

    public void vecesRepetido(Cadena objeto, String letra){
        String f = objeto.getFrase();
        int counter = 0;
        for (int i = 0; i<f.length(); i++){
            if(f.substring(i,i+1).equals(letra)){
                counter++;
            }
        }
        System.out.println("El caracter '"+ letra +"' se repite " + counter + " veces.");
    }

    public void compararLongitud(Cadena objeto, String frase){
        if(frase.length() == objeto.getFrase().length()) {
            System.out.println("La longitud es igual, " + frase.length() + " Caracteres.");
        }else System.out.println("La longitud es diferente.");
    }

    public void unirFrases(Cadena objeto, String frase){
        objeto.setFrase(objeto.getFrase()+frase);
        System.out.println("Frase nueva: " + objeto.getFrase());
    }

    public void remplazarA(Cadena objeto, String caracter){
        String f = objeto.getFrase();
        String newf = "", ask;
        for (int i = 0; i < f.length(); i++){
            if (f.substring(i, i+1).equals("a") || f.substring(i, i+1).equals("A")){
                newf = newf + caracter;
            }else newf = newf + f.substring(i, i+1);
        }
        System.out.println("Nueva Frase: "+ newf);
        System.out.println("Desea sobrescribir la frase?(Y/Any other key)");
        ask = entrada.next();
        ask = ask.toUpperCase();
        if(ask.equals("Y")){
            objeto.setFrase(newf);
            System.out.println("Saved:" + objeto.getFrase());
        }
    }

    public boolean contiene(Cadena objeto, String caracter){
        for (int i = 0; i < objeto.getFrase().length(); i++){
            if (objeto.getFrase().substring(i,i+1).equals(caracter)){
                return true;
            }
        }
        return false;
    }
}
