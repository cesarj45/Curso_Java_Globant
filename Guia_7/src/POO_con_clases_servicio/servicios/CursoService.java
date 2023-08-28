package POO_con_clases_servicio.servicios;

import POO_con_clases_servicio.entidades.Curso;

import java.util.Scanner;

public class CursoService {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public CursoService(){}

    public void cargarAlumnos(Curso objeto){
        String[] alum = new String[5];
        for (int i = 0; i <5; i++){
            System.out.print("Ingresa el alumno " + (i+1) + " : ");
            alum[i] = entrada.next();
            System.out.println();
        }
        objeto.setAlumnos(alum);
    }
    public Curso crearCurso() {
        String nombreCurso, turno;
        int cantidadHorasPorDia, cantidadDiasPorSemana, precioPorHora;
        String[] alumnos = new String[5];
        System.out.println("Ingresa el nombre del curso: ");
        nombreCurso = entrada.next();
        do {
            System.out.println("Ingresa el turno(mañana o tarde):");
            turno = entrada.next();
            turno = turno.toUpperCase();
        } while (!(turno.equals("MAÑANA") || turno.equals("TARDE")));
        System.out.println("Ingresa la cantidad de horas por dia: ");
        cantidadHorasPorDia = entrada.nextInt();
        System.out.println("Ingresa la cantidad de dias por semana: ");
        cantidadDiasPorSemana = entrada.nextInt();
        System.out.println("Ingresa el precio por hora: ");
        System.out.print("$ ");
        precioPorHora = entrada.nextInt();
        Curso c1 = new Curso(nombreCurso, turno, cantidadHorasPorDia, cantidadDiasPorSemana, precioPorHora, alumnos);
        cargarAlumnos(c1);
        return c1;
    }

    public void calcularGananciaSemanal(Curso objeto){
        System.out.println("La ganancia semanal es de: $ " + (objeto.getPrecioPorHora() * objeto.getCantidadHorasPorDia() * objeto.getCantidadDiasPorSemana() * 5));
    }

}
