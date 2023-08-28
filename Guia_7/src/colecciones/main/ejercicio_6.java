package colecciones.main;

import colecciones.servicio.TiendaService;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        TiendaService ts = new TiendaService();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String option = "";
        do {
            System.out.println("************* MENU *************\n" +
                    " 1.- Registrar Producto\n" +
                    " 2.- Modificar Producto(precio)\n" +
                    " 3.- Eliminar Producto\n" +
                    " 4.- Mostrar productos\n" +
                    " 5.- Salir\n");

            System.out.println("Ingresa la opcion del menu: ");
            option = entrada.next();
            switch (option){
                case "1":
                    ts.registrarProductos();
                    break;
                case "2":
                    ts.modificarProducto();
                    break;
                case "3":
                    ts.eliminarProducto();
                    break;
                case "4":
                    ts.mostrarProductos();
                    break;
                default:
                    if (!option.equals("5")){
                        System.out.println("Opcion no valida.");
                    }
            }
        }while (!option.equals("5"));
    }
}
