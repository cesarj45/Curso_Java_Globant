package colecciones.entidad;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNota(Integer nota) {
        if (notas.size()<3){
            notas.add(nota);
        }
    }

    @Override
    public String toString() {
        String datos = "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas= ";
        for (Integer nota: notas) {
            datos = datos.concat (nota + " ");
        }
        datos.concat("}");
        return datos;
    }
}
