package entidad;

public class Perro extends Animal{
    public Perro(String nombre, String alimento, int edad, String raza) {

        super(nombre, alimento, edad, raza);

    }
    public void alimentarse(){
        System.out.println("fdrsg: "+alimento);
    }

}
