package POO_con_clases_servicio.entidades;

import java.util.Arrays;

public class Curso {
    private String nombreCurso, turno;
    private int cantidadHorasPorDia, cantidadDiasPorSemana, precioPorHora;
    private String[] alumnos = new String[5];

    public Curso(){}
    public Curso(String nombreCurso, String turno, int cantidadHorasPorDia, int cantidadDiasPorSemana, int precioPorHora, String[] alumnos){
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", turno='" + turno + '\'' +
                ", cantidadHorasPorDia=" + cantidadHorasPorDia +
                ", cantidadDiasPorSemana=" + cantidadDiasPorSemana +
                ", precioPorHora=" + precioPorHora +
                ", alumnos=" + Arrays.toString(alumnos) +
                '}';
    }
}
