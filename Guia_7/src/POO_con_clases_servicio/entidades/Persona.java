package POO_con_clases_servicio.entidades;

import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;
    public Persona(){}
    public Persona(String nombre, Date fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

}
