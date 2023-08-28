package colecciones.servicio;

import colecciones.entidad.Pelicula;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    HashMap<String, Integer> productos = new HashMap<String, Integer>();

    public void registrarProductos(){
        String nombre, pregunta;
        Integer precio;

        do {
            System.out.println("Ingresa el nombre del producto: ");
            nombre = entrada.nextLine();
            System.out.println("Ingresa el precio del producto: ");
            precio = entrada.nextInt();
            productos.put(nombre,precio);
            productos.put("Coca cola",230);
            productos.put("Chetos flaming hot",230);
            productos.put("Gansito",230);
            System.out.println("Deseas registrar otro Producto?(SI/NO): ");
            pregunta = entrada.next();
            pregunta = pregunta.toUpperCase();
        }while (!pregunta.equals("N") && !pregunta.equals("NO"));

    }

    public void modificarProducto(){
        String nombre;
        Integer precio;
        System.out.println("Ingresa el nombre del producto a modificar: ");
        nombre = entrada.next();
        if(productos.containsKey(nombre)){
            System.out.println("Ingresa el nuevo precio para  " + nombre + ": ");
            precio = entrada.nextInt();
            productos.put(nombre,precio);
        }else System.out.println("No se encontro el producto " + nombre);

    }

    public void eliminarProducto(){
        String nombre;
        System.out.println("Ingresa el nombre del producto a eliminar: ");
        nombre = entrada.next();
        if(productos.containsKey(nombre)){
            productos.remove(nombre);
            System.out.println("Se elimino el producto " + nombre);
        }else System.out.println("No se encontro el producto " + nombre);

    }
    
    public void mostrarProductos(){
        System.out.println();
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto: "+ entry.getKey());
            System.out.println("Precio: "+ entry.getValue());
        }
        System.out.println();
    }

}
