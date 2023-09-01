package entidad;

public class Gato extends Animal{
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    public void alimentarse(){
        System.out.println("fdrsg: "+alimento);
    }
}
