package colecciones.servicio;

import colecciones.entidad.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    String nombre, pregunta;
    public void crearAlumnos(){
        do {
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingresa el nombre del Alumno: ");
            nombre = entrada.next();
            for (int i=0; i<3; i++){
                System.out.println("Ingresa la nota "+(i+1)+": ");
                notas.add(entrada.nextInt());
            }
            alumnos.add(new Alumno(nombre, notas));

            System.out.println("Deseas registrar otro Alumno?(SI/NO): ");
            pregunta = entrada.next();
            pregunta = pregunta.toUpperCase();
        }while (!pregunta.equals("N") && !pregunta.equals("NO"));
    }

    public void notaFinal(){
        boolean exist = false;
        System.out.println("Ingresa el nombre del Alumno a calificar: ");
        nombre = entrada.next();
        for (Alumno alumno: alumnos){
            if(alumno.getNombre().equals(nombre)){
                exist = true;
                System.out.println(alumno.toString());
                ArrayList<Integer> notas = alumno.getNotas();
                Integer promedio = 0;
                for (Integer nota: notas) {
                    promedio += nota;
                }
                System.out.println("La nota final para "+alumno.getNombre()+" es: "+(promedio/3));
            }
        }
        if (!exist){
            System.out.println("El Alumno "+nombre+" No existe.");
        }
    }
}
