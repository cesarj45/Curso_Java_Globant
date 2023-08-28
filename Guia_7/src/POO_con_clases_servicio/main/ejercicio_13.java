package POO_con_clases_servicio.main;

import POO_con_clases_servicio.entidades.Curso;
import POO_con_clases_servicio.servicios.CursoService;

public class ejercicio_13 {
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso curso = cs.crearCurso();
        System.out.println(curso.toString());
        cs.calcularGananciaSemanal(curso);
    }
}
