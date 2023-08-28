package colecciones.main;

import colecciones.entidad.Alumno;
import colecciones.servicio.AlumnoService;

public class ejercicio_3 {
    public static void main(String[] args) {
        AlumnoService ListaGrupo1 = new AlumnoService();
        ListaGrupo1.crearAlumnos();
        ListaGrupo1.notaFinal();

    }
}
