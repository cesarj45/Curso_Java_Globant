package entidad;

public class Perro extends Animal{
    private String alimento;
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.alimento = alimento;
    }

}
